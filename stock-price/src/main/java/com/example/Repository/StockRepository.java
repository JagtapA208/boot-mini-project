package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Entity.Stock;

public interface StockRepository extends JpaRepository<Stock,Integer> {

    @Query("select price from Stock where name = :name")
    public Double getStockPriceByName(String name);
}
