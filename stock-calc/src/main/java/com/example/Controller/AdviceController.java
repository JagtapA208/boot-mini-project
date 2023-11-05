package com.example.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.Exception.NullStockPriceException;

@RestControllerAdvice
public class AdviceController {


    @ExceptionHandler(NullStockPriceException.class)
    public ResponseEntity<String> handleNullStockPriceExeption(NullStockPriceException e){

        return new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
    }
    
}
