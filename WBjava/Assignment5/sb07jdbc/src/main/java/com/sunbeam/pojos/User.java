package com.sunbeam.pojos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private int uid;
    private String name;
    private String email;
    private String password;
    private String mobile;

    public User(String name, String email, String password, String mobile) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
    }
}
