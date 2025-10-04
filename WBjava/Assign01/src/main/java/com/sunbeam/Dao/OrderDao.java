package com.sunbeam.Dao;

import com.sunbeam.entities.Order;
import com.sunbeam.entities.OrderDetail;

import java.util.List;

public interface OrderDao {
    // Methods for Order
    int saveOrder(Order order) throws Exception;
    Order findOrderById(int orderId) throws Exception;
    List<Order> findOrdersByUserId(int userId) throws Exception;
    List<Order> findAllOrders() throws Exception;
    int updateOrderStatus(int orderId, String status) throws Exception;

    // Methods for OrderDetails
    int saveOrderDetail(OrderDetail detail) throws Exception;
    List<OrderDetail> findOrderDetailsByOrderId(int orderId) throws Exception;
}
