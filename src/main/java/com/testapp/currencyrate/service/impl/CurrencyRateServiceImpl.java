package com.testapp.currencyrate.service.impl;

import com.testapp.currencyrate.dto.api.CurrencyApiResponse;
import com.testapp.currencyrate.dto.CurrencyRateDto;
import com.testapp.currencyrate.feign.CurrencyApiClient;
import com.testapp.currencyrate.mapper.CurrencyRateMapper;
import com.testapp.currencyrate.service.CurrencyRateService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CurrencyRateServiceImpl implements CurrencyRateService {

    private final CurrencyApiClient currencyApiClient;
    private final CurrencyRateMapper currencyRateMapper;

    @Value("${api.exchange-rates-api.key}")
    private String apiKey;

    @Override
    public Map<LocalDate, CurrencyRateDto> getCurrencyRatesHistory() {
        Map<LocalDate, CurrencyRateDto> ratesHistoryResponse = new HashMap<>();
        CurrencyApiResponse apiResponse;
        for (int i = 0; i<=10; i++){
            LocalDate currentDate = LocalDate.now().minusDays(1+i);
            String date = currentDate.format(DateTimeFormatter.ofPattern("yyy-MM-dd"));
            apiResponse = currencyApiClient.getRatesHistory(apiKey, date, "KZT", "EUR,USD,RUB").getBody();
            CurrencyRateDto currencyRate = currencyRateMapper.apply(apiResponse);
            ratesHistoryResponse.put(currentDate, currencyRate);
        }
        return ratesHistoryResponse;
    }
}
