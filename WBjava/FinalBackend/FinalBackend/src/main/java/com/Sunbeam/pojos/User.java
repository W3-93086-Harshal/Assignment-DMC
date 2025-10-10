package com.Sunbeam.pojos;


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
}
