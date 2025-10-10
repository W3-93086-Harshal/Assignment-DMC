package com.Sunbeam.daos;

import com.Sunbeam.pojos.FoodItem;

import java.util.List;

public interface FoodItemDao {
    FoodItem findByName(String name) throws Exception;

    FoodItem findById(int id) throws Exception;

    List<FoodItem> findAll() throws Exception;

    List<FoodItem> findByType(String type) throws Exception;

    int save(FoodItem item) throws Exception;

    int update(FoodItem item) throws Exception;

    int updatePrice(int id, double newPrice) throws Exception; // Added relevant method

    int deleteById(int id) throws Exception;

}
