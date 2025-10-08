package com.sunbeam.daos;

import com.sunbeam.pojos.FoodItem;
import com.sunbeam.pojos.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class FoodItemRowMapper implements RowMapper<FoodItem> {
    @Override
    public FoodItem mapRow(ResultSet rs, int rowNum) throws SQLException {
        FoodItem foodItem = new FoodItem();
        foodItem.setFid(rs.getInt("fid"));
        foodItem.setName(rs.getString("name"));
        foodItem.setPrice(rs.getDouble("price"));
        foodItem.setDescription(rs.getString("description"));
        foodItem.setImage(rs.getString("image"));
        foodItem.setType(rs.getString("type"));
        return foodItem;
    }
}
