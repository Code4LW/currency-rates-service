package com.testapp.currencyrate.feign;

import com.testapp.currencyrate.dto.api.CurrencyApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "currencyApi", url = "${api.exchange.rates-api.get-rates-url}")
public interface CurrencyApiClient {

    @GetMapping()
    ResponseEntity<CurrencyApiResponse> getRatesHistory(
            @RequestParam("apikey") String apiKey,
            @RequestParam("date") String date,
            @RequestParam("base_currency") String base,
            @RequestParam("currencies") String symbols);
}
