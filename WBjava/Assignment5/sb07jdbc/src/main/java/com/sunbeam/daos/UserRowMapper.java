package com.sunbeam.daos;

import com.sunbeam.pojos.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User u = new User();
        u.setUid(rs.getInt("uid"));
        u.setName(rs.getString("name"));
        u.setEmail(rs.getString("email"));
        u.setMobile(rs.getString("mobile"));
        u.setPassword(rs.getString("password"));
        return u;
    }
}
