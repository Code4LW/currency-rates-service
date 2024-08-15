package com.testapp.currencyrate.service;

import com.testapp.currencyrate.dto.CurrencyRateDto;

import java.time.LocalDate;
import java.util.Map;

public interface CurrencyRateService {

    Map<LocalDate, CurrencyRateDto> getCurrencyRatesHistory();
}
