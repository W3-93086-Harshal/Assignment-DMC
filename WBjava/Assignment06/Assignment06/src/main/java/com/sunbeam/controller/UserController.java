package com.sunbeam.controller;

import com.sunbeam.pojos.Credentials;
import com.sunbeam.pojos.User;
import com.sunbeam.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private UserServices userService;

    @PostMapping("/login")
    public String authenticate(Credentials cr, Model model) throws Exception {
        User user = userService.getUserByCredentials(cr);

            model.addAttribute("message", "Hello, " + user.getName());
        return "welcome";
    }
}
