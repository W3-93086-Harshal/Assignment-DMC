package com.Sunbeam.daos;


import com.Sunbeam.pojos.FoodItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class FoodItemDaoImpl implements FoodItemDao {
    private JdbcTemplate jdbcTemplate;
    private FoodItemRowMapper foodItemRowMapper;

    @Autowired
    public FoodItemDaoImpl(JdbcTemplate jdbcTemplate, FoodItemRowMapper foodItemRowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.foodItemRowMapper = foodItemRowMapper;
    }

    @Override
    public List<FoodItem> findAll() throws Exception {
        String sql = "SELECT * FROM food";
        List<FoodItem> list = jdbcTemplate.query(sql,foodItemRowMapper);
        return list;
    }

    @Override
    public FoodItem findById(int id) throws Exception {
        String sql = "SELECT * FROM food WHERE fid=?";
        List<FoodItem> list = jdbcTemplate.query(sql,foodItemRowMapper,id);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public FoodItem findByName(String name) throws Exception {
        String sql = "SELECT * FROM food WHERE name=?";
        List<FoodItem> list = jdbcTemplate.query(sql,foodItemRowMapper, name);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public List<FoodItem> findByType(String type) throws Exception {
        String sql = "SELECT * FROM food WHERE type=?";
        List<FoodItem> list = jdbcTemplate.query(sql,foodItemRowMapper, type);
        return list;
    }
    @Override
    public int save(FoodItem item) throws Exception {
        String sql = "INSERT INTO food(name, price, description, image, type) VALUES(?, ?, ?, ?, ?)";
        int cnt = jdbcTemplate.update(sql, item.getName(), item.getPrice(),
                item.getDescription(), item.getImage(), item.getType());
        return cnt;
    }

    @Override
    public int update(FoodItem item) throws Exception {
        String sql = "UPDATE food SET name=?, price=?, description=?, image=?, type=? WHERE fid=?";
        int cnt = jdbcTemplate.update(sql, item.getName(), item.getPrice(),
                item.getDescription(), item.getImage(), item.getType(), item.getFid());
        return cnt;
    }

    @Override
    public int updatePrice(int fid, double newPrice) throws Exception {
        String sql = "UPDATE food SET price=? WHERE fid=?";
        int cnt = jdbcTemplate.update(sql, newPrice, fid);
        return cnt;
    }

    @Override
    public int deleteById(int id) throws Exception {
        String sql = "DELETE FROM food WHERE fid=?";
        int cnt = jdbcTemplate.update(sql, id);
        return cnt;
    }
}
