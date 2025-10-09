package com.sunbeam.Dao;

import com.sunbeam.pojos.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User() {
            @Override
            public User findByEmail(String email) throws Exception {
                return null;
            }

            @Override
            public User findById(int id) throws Exception {
                return null;
            }

            @Override
            public List<User> findAll() throws Exception {
                return List.of();
            }

            @Override
            public int save(User u) throws Exception {
                return 0;
            }

            @Override
            public int update(User u) throws Exception {
                return 0;
            }

            @Override
            public int deleteByEmail(String email) throws Exception {
                return 0;
            }

            @Override
            public int deleteById(int id) throws Exception {
                return 0;
            }
        };
        user.setUid(rs.getInt("uid"));
        user.setName(rs.getString("name"));
        user.setEmail(rs.getString("email"));
        user.setPassword(rs.getString("password"));
        user.setMobile(rs.getString("mobile"));
        return user;
    }

}
