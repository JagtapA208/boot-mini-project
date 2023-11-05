package com.example;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.Entity.Stock;
import com.example.Repository.StockRepository;

@Component
public class SaveStockPriceRunner implements ApplicationRunner{


    @Autowired
    private StockRepository stockRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        

        Stock Hcl = new Stock();
        Hcl.setName("hcl");
        Hcl.setPrice(434.95);

        Stock Tcs = new Stock();
        Tcs.setName("tcs");
        Tcs.setPrice(3359.95);

        Stock Itc = new Stock();
        Itc.setName("itc");
        Itc.setPrice(431.1);

        stockRepository.save(Hcl);
        stockRepository.save(Tcs);
        stockRepository.save(Itc);

    }
    
}
