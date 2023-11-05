package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.StockService;

@RestController
public class StockController {

    @Autowired
    private StockService stockService;
 
    @GetMapping("/stock-price/{stockName}")
    public ResponseEntity<Double> getStockPriceByName(@PathVariable("stockName")String stockName){

        Double stockPrice = stockService.getStockPriceByName(stockName.toLowerCase());

        return new ResponseEntity<Double>(stockPrice, HttpStatus.OK);
    }
}
