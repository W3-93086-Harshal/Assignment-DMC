package com.sunbeam.entities;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data //@Getter @Setter @ToString
public class User {
    private int uid;
    private String name;
    private String email;
    private String password;
    private String mobile;
}