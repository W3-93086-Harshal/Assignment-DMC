package com.sunbeam.Dao;

import com.sunbeam.entities.FoodItem;
import com.sunbeam.entities.User;
import com.sunbeam.utils.DButil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.list;

public class UserDaoImpl extends Dao implements UserDao {
    public UserDaoImpl() throws Exception {
        super();
    }
    @Override
    public User findByEmail(String email) throws Exception {
        String sql = "SELECT * FROM user WHERE email=?";
        try(PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, email);
            try(ResultSet rs = stmt.executeQuery()) {
                if(rs.next()) {
                    User u = new User();
                    u.setUid(rs.getInt("uid"));
                    u.setName(rs.getString("name"));
                    u.setEmail(rs.getString("email"));
                    u.setMobile(rs.getString("mobile"));
                    u.setPassword(rs.getString("password"));
                    return u;
                }
            }
        }
        return null;
    }

    @Override
    public List<User> findAll() throws Exception {
        // SQL: "SELECT * FROM user"
        // Implement logic: execute query, loop through ResultSet, map to User list.
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM user";
        try (Connection con = DButil.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                users.add(mapResultSetToUser(rs));
            }
        }
        return users;
    }
    @Override
    public int save(User u) throws Exception {
        // SQL: "INSERT INTO user(name, email, password, mobile) VALUES (?, ?, ?, ?)"
        // Implement logic: execute update.
        String sql = "INSERT INTO user(uid,name, email, password, mobile) VALUES (?, ?, ?, ?)";
        try (Connection con = DButil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, u.getUid());
            ps.setString(2, u.getName());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getPassword());
            ps.setString(5, u.getMobile());
            return ps.executeUpdate();
        }
    }
    @Override
    public int update(User u) throws Exception {
        // SQL: "UPDATE user SET name = ?, password = ?, mobile = ? WHERE uid = ?"
        // Implement logic: execute update.
        String sql = "UPDATE user SET name = ?, password = ?, mobile = ? WHERE uid = ?";
        try (Connection con = DButil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, u.getName());
            ps.setString(2, u.getPassword());
            ps.setString(3, u.getMobile());
            ps.setInt(4, u.getUid());
            return ps.executeUpdate();
        }
    }
    @Override
    public int deleteByEmail(String email) throws Exception {
        // SQL: "DELETE FROM user WHERE email = ?"
        // Implement logic: execute update.
        String sql = "DELETE FROM user WHERE email = ?";
        try (Connection con = DButil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, email);
            return ps.executeUpdate();
        }
    }
    @Override
    public User findById(int id) throws Exception {
        // SQL: "SELECT * FROM user WHERE uid = ?"
        String sql = "SELECT * FROM user WHERE uid = ?";
        try (Connection con = DButil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return mapResultSetToUser(rs);
                }
            }
        }
        return null;
    }
    private User mapResultSetToUser(ResultSet rs) throws SQLException {
        User u = new User();
        u.setUid(rs.getInt("uid"));
        u.setName(rs.getString("name"));
        u.setEmail(rs.getString("email"));
        u.setPassword(rs.getString("password"));
        u.setMobile(rs.getString("mobile"));
        return u;
    }
}

