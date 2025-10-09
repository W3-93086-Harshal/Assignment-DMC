package com.sunbeam.daos;
import com.sunbeam.pojos.User;

import java.util.List;

public interface UserDao {
    User findByEmail(String email) throws Exception;

    List<User> findAll() throws Exception;

    int save(User u) throws Exception;

    int update(User u) throws Exception;

    int deleteByEmail(String email) throws Exception;

    User findById(int id) throws Exception; // Added for convenience

    int deleteById(int id) throws Exception;


}
