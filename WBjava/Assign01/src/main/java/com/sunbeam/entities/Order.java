package com.sunbeam.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {
    private int oid;
    private int uid;
    private Timestamp orderDate;
    private Timestamp deliveryDate;
    private double totalAmount;
    private String status;
    private List<OrderDetail> orderDetails; // To hold related order details
    // Add constructors, getters, and setters
}


