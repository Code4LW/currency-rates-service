package com.testapp.currencyrate.mapper;

import com.testapp.currencyrate.dto.api.CurrencyApiResponse;
import com.testapp.currencyrate.dto.api.CurrencyDto;
import com.testapp.currencyrate.dto.CurrencyRateDto;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Component
public class CurrencyRateMapper implements Function<CurrencyApiResponse, CurrencyRateDto> {

    @Override
    public CurrencyRateDto apply(CurrencyApiResponse currencyApiResponse) {
        Map<String, BigDecimal> rates = new HashMap<>();
        Map<String, CurrencyDto> apiData = currencyApiResponse.data();
        for (String key : apiData.keySet()) {
            rates.put(key, apiData.get(key).getValue());
        }
        String base = "KZT";
        return new CurrencyRateDto(base, rates);
    }
}
