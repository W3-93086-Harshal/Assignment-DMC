package com.sunbeam.daos;


import com.sunbeam.pojos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired // setter-based di
    private JdbcTemplate jdbcTemplate;

    @Autowired // setter-based di
    private UserRowMapper userRowMapper;

    @Override
    public User findByEmail(String email) throws Exception {
        String sql = "SELECT * FROM user WHERE email=?";
        User user = jdbcTemplate.queryForObject(sql,userRowMapper,email);
        return user;
    }
    @Override
    public int save(User u) throws Exception {
        String sql = "INSERT INTO user(name, email, password, mobile) VALUES(?, ?, ?, ?)";
        int count = jdbcTemplate.update(sql, u.getName(), u.getEmail(), u.getPassword(), u.getMobile());
        return count;
    }
}
