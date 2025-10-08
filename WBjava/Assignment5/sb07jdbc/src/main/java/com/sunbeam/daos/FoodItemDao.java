package com.sunbeam.daos;

import com.sunbeam.pojos.FoodItem;

import java.util.List;

public interface FoodItemDao {
    FoodItem findbyId(int fid) throws Exception;
    int save(FoodItem foodItem) throws Exception;
    int updatePrice(int fid, double newPrice) throws Exception;
    List<FoodItem> findByType(String type) throws Exception;
}
