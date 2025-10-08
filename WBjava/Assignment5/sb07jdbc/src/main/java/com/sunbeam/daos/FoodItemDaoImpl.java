package com.sunbeam.daos;

import com.sunbeam.pojos.FoodItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FoodItemDaoImpl implements FoodItemDao {
    @Autowired // setter-based di
    private JdbcTemplate jdbcTemplate;

    @Autowired // setter-based di
    private FoodItemRowMapper foodItemRowMapper;


    @Override
    public FoodItem findbyId(int id) throws Exception { // Corrected return type
        String sql = "SELECT * FROM food WHERE fid=?";
        FoodItem item = jdbcTemplate.queryForObject(sql, foodItemRowMapper, id);
        return item; // Returns the FoodItem object
    }

    @Override
    public int save(FoodItem foodItem) throws Exception {
        // Added a fifth placeholder (?) for the 'image' column value
        String sql = "INSERT INTO food (fid, name, price, description, image) VALUES(?, ?, ?, ?, ?)";
        int count = jdbcTemplate.update(sql,foodItem.getFid(),foodItem.getName(),foodItem.getPrice(),foodItem.getDescription(),foodItem.getImage());
        return count;
    }
    @Override
    public int updatePrice(int fid, double newPrice) throws Exception {
        String sql = "UPDATE food SET price=? WHERE fid=?";
        int cnt = jdbcTemplate.update(sql, newPrice, fid);
        return cnt;
    }
    @Override
    public List<FoodItem> findByType (String type) throws Exception {
        String sql = "SELECT * FROM food WHERE type=?";
        List<FoodItem> list = jdbcTemplate.query(sql, foodItemRowMapper, type);
        return list;
    }
}
