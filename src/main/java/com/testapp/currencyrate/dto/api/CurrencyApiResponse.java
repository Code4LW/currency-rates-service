package com.testapp.currencyrate.dto.api;


import java.util.Map;

public record CurrencyApiResponse(Map<String, CurrencyDto> data) {
}
