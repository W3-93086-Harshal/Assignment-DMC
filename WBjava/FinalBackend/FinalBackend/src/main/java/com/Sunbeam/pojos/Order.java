package com.Sunbeam.pojos;


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
    private Timestamp odate ;
    private Timestamp deldate;
    private double total_amount;
    private String status = "Pending";
    private List<OrderDetail> orderDetails;
}
