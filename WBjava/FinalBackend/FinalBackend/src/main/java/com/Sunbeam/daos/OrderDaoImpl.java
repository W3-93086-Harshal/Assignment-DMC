package com.Sunbeam.daos;


import com.Sunbeam.pojos.Order;
import com.Sunbeam.pojos.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class OrderDaoImpl implements OrderDao{
    private JdbcTemplate jdbcTemplate;
    private OrderRowMapper orderRowMapper;
    private OrderDetailRowMapper orderDetailRowMapper;

    @Autowired
    public OrderDaoImpl(JdbcTemplate jdbcTemplate, OrderRowMapper orderRowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.orderRowMapper = orderRowMapper;
    }
    @Autowired
    public OrderDaoImpl(JdbcTemplate jdbcTemplate,OrderDetailRowMapper orderDetailRowMapper) {
        this.orderDetailRowMapper = orderDetailRowMapper;
    }
    @Override
    public int saveOrder(Order order) throws Exception {
        String sql = "INSERT INTO orders(oid, uid, odate, deldate, total_amount, status) VALUES(?, ?, ?, ?, ?, ?)";
        int cnt = jdbcTemplate.update(sql, order.getOid(),order.getUid(),order.getOdate(),order.getDeldate(),order.getTotal_amount(),order.getStatus());
        return cnt;
    }

    @Override
    public Order findOrderById(int oId) throws Exception {
        String sql = "SELECT * FROM orders WHERE oid=?";
        List<Order> list = jdbcTemplate.query(sql,orderRowMapper,oId);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public List<Order> findOrdersByUserId(int uId) throws Exception {
        String sql = "SELECT * FROM orders WHERE uid=?";
        List<Order> list = jdbcTemplate.query(sql,orderRowMapper,uId);
        return list;
    }

    @Override
    public List<Order> findAllOrders() throws Exception {
        String sql = "SELECT * FROM orders";
        List<Order> list = jdbcTemplate.query(sql,orderRowMapper);
        return list;
    }

    @Override
    public int updateOrderStatus(int oId, String status) throws Exception {
        String sql = "UPDATE orders SET status=? WHERE oid=?";
        int cnt = jdbcTemplate.update(sql, status, oId);
        return cnt;
    }

    @Override
    public int saveOrderDetail(OrderDetail detail) throws Exception {
        String sql = "insert into orderdetails(oid,fid,quantity)  values(?,?,?,)";
        int cnt =jdbcTemplate.update(sql,detail.getOid(),detail.getFid(),detail.getQuantity());
        return cnt;
    }

    @Override
    public List<OrderDetail> findOrderDetailsByOrderId(int oid) throws Exception {
        String sql = "SELECT *  FROM orderdetails where oid = ?";
        List<OrderDetail> list = jdbcTemplate.query(sql,orderDetailRowMapper,oid);
        return list;
    }
}
