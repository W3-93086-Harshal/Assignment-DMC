package com.sunbeam.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class User {
    private int uid;
    private String name;
    private String email;
    private String password;
    private String mobile;

    public abstract User findByEmail(String email) throws Exception;

    public abstract User findById(int id) throws Exception;

    public abstract List<User> findAll() throws Exception;

    public abstract int save(User u) throws Exception;

    public abstract int update(User u) throws Exception;

    public abstract int deleteByEmail(String email) throws Exception;

    public abstract int deleteById(int id) throws Exception;
}
