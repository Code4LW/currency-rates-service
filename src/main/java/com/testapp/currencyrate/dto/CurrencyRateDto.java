package com.testapp.currencyrate.dto;

import java.math.BigDecimal;
import java.util.Map;


public record CurrencyRateDto(String base, Map<String, BigDecimal> rates) {
}
