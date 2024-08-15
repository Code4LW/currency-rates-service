package com.testapp.currencyrate.dto.api;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CurrencyDto {
    private BigDecimal value;
}
