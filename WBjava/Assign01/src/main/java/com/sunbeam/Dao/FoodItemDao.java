package com.sunbeam.Dao;

import com.sunbeam.entities.FoodItem;

import java.util.List;

public interface FoodItemDao extends AutoCloseable {
    FoodItem findByName(String name) throws Exception;
    FoodItem findById(int id) throws Exception;
    List<FoodItem> findAll() throws Exception;
    int save(FoodItem item) throws Exception;
    int updatePrice(int fid, double newPrice) throws Exception; // Added relevant method
    int deleteById(int fid) throws Exception; // Added relevant method
}
