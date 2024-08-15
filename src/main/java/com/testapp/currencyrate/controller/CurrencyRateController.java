package com.testapp.currencyrate.controller;

import com.testapp.currencyrate.dto.CurrencyRateDto;
import com.testapp.currencyrate.service.CurrencyRateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/currency-rates")
@RequiredArgsConstructor
public class CurrencyRateController {

    private final CurrencyRateService currencyRateService;

    @GetMapping("/history")
    public ResponseEntity<Map<LocalDate, CurrencyRateDto>> getCurrencyRatesHistory() {
        Map<LocalDate, CurrencyRateDto> currencyRateResponse = currencyRateService.getCurrencyRatesHistory();
        return ResponseEntity.ok(currencyRateResponse);
    }
}
