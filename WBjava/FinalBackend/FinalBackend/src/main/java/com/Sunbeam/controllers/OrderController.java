package com.Sunbeam.controllers;

import com.Sunbeam.daos.OrderDao;
import com.Sunbeam.pojos.Order;
import com.Sunbeam.pojos.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderDao orderDao;

    @GetMapping("/orders")
    public Resp<List<Order>> getAllOrders() throws Exception{
        List<Order> list = orderDao.findAllOrders();
        return Resp.success(list);
    }
    @GetMapping("/orders/{oid}")
    public Resp<Order> getOrderById (@PathVariable("oid")  int oid) throws Exception{
        Order order = orderDao.findOrderById(oid);
        if(order == null)
            return Resp.error("order not Found");
        return Resp.success(order);
    }
    @GetMapping("/orders/bytype/{uid}")
    public Resp<?> getOrderBy(@PathVariable("uid") int uid) throws Exception{
        List<Order> = orderDao.findOrderById(uid);


    }

