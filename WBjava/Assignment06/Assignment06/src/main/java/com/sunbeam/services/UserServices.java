package com.sunbeam.services;

import com.sunbeam.Dao.UserDao;
import com.sunbeam.pojos.Credentials;
import com.sunbeam.pojos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    @Autowired
    private UserDao userDao;

    public User getUserByCredentials(Credentials cr) throws Exception {
        User dbUser = userDao.findByEmail(cr.getEmail());
        if(dbUser != null && dbUser.getPassword().equals(cr.getPasswd()))
            return dbUser;
        return null;
    }
}
