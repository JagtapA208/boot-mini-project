package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Stock;
import com.example.Service.StockCalcService;

@RestController
public class StockCalcController {

    @Autowired
    private StockCalcService stockCalcService;

    @GetMapping("/stock-calc")
    public ResponseEntity<Double> getTotalCost(@RequestBody Stock stock){
        
        Double stockTotalAmount = stockCalcService.calculateStockTotalAmount(stock);

        return new ResponseEntity<Double>(stockTotalAmount,HttpStatus.OK);
    }
    
}
