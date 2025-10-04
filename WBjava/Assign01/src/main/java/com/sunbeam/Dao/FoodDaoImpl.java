package com.sunbeam.Dao;
import com.sunbeam.entities.FoodItem;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FoodDaoImpl extends Dao implements FoodItemDao {
    public FoodDaoImpl() throws Exception {
    }
    @Override
    public List<FoodItem> findAll() throws Exception {
        List<FoodItem> list = new ArrayList<>();
        String sql = "SELECT * FROM food";
        try(PreparedStatement stmt = con.prepareStatement(sql)) {
            try(ResultSet rs = stmt.executeQuery()) {
                while(rs.next()) {
                    FoodItem fi = new FoodItem();
                    fi.setFid(rs.getInt("fid"));
                    fi.setName(rs.getString("name"));
                    fi.setPrice(rs.getDouble("price"));
                    fi.setDescription(rs.getString("description"));
                    fi.setImage(rs.getString("image"));
                    list.add(fi);
                }
            }
        }
        return list;
    }

    @Override
    public int save(FoodItem item) throws Exception {
        return 0;
    }

    @Override
    public int updatePrice(int id, double newPrice) throws Exception {

        return 0;
    }

    @Override
    public int deleteById(int fid) throws Exception {
        return 0;
    }

    @Override
    public FoodItem findByName(String name) throws Exception {
        return null;
    }

    @Override
    public FoodItem findById(int id) throws Exception {
        String sql = "SELECT * FROM food WHERE fid=?";
        try(PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try(ResultSet rs = stmt.executeQuery()) {
                if(rs.next()) {
                    FoodItem fi = new FoodItem();
                    fi.setFid(rs.getInt("fid"));
                    fi.setName(rs.getString("name"));
                    fi.setPrice(rs.getDouble("price"));
                    fi.setDescription(rs.getString("description"));
                    fi.setImage(rs.getString("image"));
                    return fi;
                }
            }
        }
        return null;
    }
}
