package com.sunbeam.Dao;

import com.sunbeam.entities.User;

import java.util.List;


public interface UserDao extends AutoCloseable {
    public User findByEmail(String email) throws Exception;
    List<User> findAll() throws Exception;
    int save(User u) throws Exception;
    int update(User u) throws Exception;
    int deleteByEmail(String email) throws Exception;
    User findById(int id) throws Exception;
}