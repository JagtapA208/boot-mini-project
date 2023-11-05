package com.example.Exception;


public class NullStockPriceException extends RuntimeException {
    
    public NullStockPriceException(String msg){
        super(msg);
    }

}
