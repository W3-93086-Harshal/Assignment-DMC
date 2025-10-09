package com.sunbeam.controller;

import com.sunbeam.daos.UserDao;
import com.sunbeam.pojos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RestController  // @RestController = @Controller + @ResponseBody
public class UserController {
    @Autowired
    private UserDao userDao;
    @GetMapping("/User")
    public List<User> getAllUser() throws Exception {
        List<User> list = userDao.findAll();
        return list;
    }
    @GetMapping("/User/{UserId}")
    public User getUserById(@PathVariable("UserId") int uid) throws Exception {
        User user = userDao.findById(uid);
        return user;
    }
    @PostMapping("/User")
    public String addUser(@RequestBody User user) throws Exception {
        int cnt = userDao.save(user);
        return "Records Saved: " + cnt;
    }
    @PutMapping("/User/{UserId}")
    public String updateUser(@PathVariable("UserId") int uid,
                             @RequestBody User user) throws Exception {
        user.setUid();
        int cnt = userDao.update(user);
        return "Records Updated: " + cnt;
    }
    @DeleteMapping("/User/{UserId}")
    public String deleteUserById(@PathVariable("UserId") int uid) throws Exception {
        int cnt = userDao.deleteById(uid);
        return "Records Deleted: " + cnt;
    }
}
