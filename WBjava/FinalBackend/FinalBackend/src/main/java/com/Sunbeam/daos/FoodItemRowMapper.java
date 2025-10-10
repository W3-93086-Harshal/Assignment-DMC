package com.Sunbeam.daos;

import com.Sunbeam.pojos.FoodItem;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FoodItemRowMapper implements RowMapper<FoodItem> {
    @Override
    public FoodItem mapRow(ResultSet rs, int rowNum) throws SQLException {
        FoodItem fi = new FoodItem();
        fi.setFid(rs.getInt("fid"));
        fi.setName(rs.getString("name"));
        fi.setPrice(rs.getDouble("price"));
        fi.setDescription(rs.getString("description"));
        fi.setImage(rs.getString("image"));
        fi.setType(rs.getString("type"));
        return fi;
    }
}
