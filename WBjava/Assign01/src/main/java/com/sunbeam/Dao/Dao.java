package com.sunbeam.Dao;

import com.sunbeam.entities.FoodItem;
import com.sunbeam.utils.DButil;

import java.sql.Connection;
import java.util.List;

public abstract class Dao {
    protected Connection con;
    public Dao() throws Exception {
        con = DButil.getConnection();
    }

    public void close() throws Exception {
        con.close();
    }
}
