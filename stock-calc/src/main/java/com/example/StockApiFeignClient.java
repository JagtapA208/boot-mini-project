package com.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("STOCK-API")
public interface StockApiFeignClient {

    @GetMapping("/stock-price/{stockName}")
    public Double getStockPriceByName(@PathVariable("stockName")String stockName);
    
}
