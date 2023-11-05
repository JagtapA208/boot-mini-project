package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StockApiFeignClient;
import com.example.Exception.NullStockPriceException;
import com.example.Model.Stock;

@Service
public class StockCalcServiceImpl implements StockCalcService {

    @Autowired
    private StockApiFeignClient stockApiFeignClient;

    @Override
    public Double calculateStockTotalAmount(Stock stock) {
        
        Double stockPrice = stockApiFeignClient.getStockPriceByName(stock.getName());

        if(stockPrice == null) throw new  NullStockPriceException("Please check stock name");

        return stockPrice * stock.getQuantity();
    }
    
}
