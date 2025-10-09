package com.sunbeam.daos;

import com.sunbeam.pojos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserDaoImpl  implements UserDao{
    private JdbcTemplate jdbcTemplate;
    private UserRowMapper userRowMapper;

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate, UserRowMapper userRowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.userRowMapper = userRowMapper;
    }

    @Override
    public User findByEmail(String email) throws Exception {
        String sql = "SELECT * FROM user WHERE email=?";
        List<User> list = jdbcTemplate.query(sql, userRowMapper, email);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public User findById(int id) throws Exception {
        String sql = "SELECT * FROM user WHERE uid=?";
        List<User> list = jdbcTemplate.query(sql, userRowMapper, id);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public List<User> findAll() throws Exception {
        String sql = "SELECT * FROM user";
        List<User> list = jdbcTemplate.query(sql, userRowMapper);
        return list;
    }

    @Override
    public int save(User u) throws Exception {
        String sql = "INSERT INTO user(name, email, password, mobile) VALUES(?, ?, ?, ?)";
        int cnt = jdbcTemplate.update(sql, u.getName(), u.getEmail(), u.getPassword(), u.getMobile());
        return cnt;
    }

    @Override
    public int update(User u) throws Exception {
        String sql = "UPDATE user SET name=?, email=?, password=?, mobile=? WHERE uid=?";
        int cnt = jdbcTemplate.update(sql, u.getName(), u.getEmail(), u.getPassword(), u.getMobile(), u.getUid());
        return cnt;
    }

    @Override
    public int deleteByEmail(String email) throws Exception {
        String sql = "DELETE FROM user WHERE email=?";
        int cnt = jdbcTemplate.update(sql, email);
        return cnt;
    }

    @Override
    public int deleteById(int id) throws Exception {
        String sql = "DELETE FROM user WHERE uid=?";
        int cnt = jdbcTemplate.update(sql, id);
        return cnt;
    }
}
