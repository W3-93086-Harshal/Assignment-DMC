package com.sunbeam.daos;

import com.sunbeam.pojos.User;

public interface UserDao {

    User findByEmail(String email) throws Exception;

    int save(User user) throws Exception;
}