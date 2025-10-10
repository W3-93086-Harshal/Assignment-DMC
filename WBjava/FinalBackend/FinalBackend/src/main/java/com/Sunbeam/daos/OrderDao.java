package com.Sunbeam.daos;

import com.Sunbeam.pojos.Order;
import com.Sunbeam.pojos.OrderDetail;

import java.util.List;

public interface OrderDao {
    int saveOrder(Order order) throws Exception;
    Order findOrderById(int orderId) throws Exception;
    List<Order> findOrdersByUserId(int userId) throws Exception;
    List<Order> findAllOrders() throws Exception;
    int updateOrderStatus(int orderId, String status) throws Exception;

    int saveOrderDetail(OrderDetail detail) throws Exception;
    List<OrderDetail> findOrderDetailsByOrderId(int orderId) throws Exception;
}
