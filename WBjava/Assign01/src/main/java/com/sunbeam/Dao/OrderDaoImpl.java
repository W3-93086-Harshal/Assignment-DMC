package com.sunbeam.Dao;

import com.sunbeam.entities.Order;
import com.sunbeam.entities.OrderDetail;
import com.sunbeam.utils.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OrderDaoImpl implements OrderDao {

    @Override
    public int saveOrder(Order order) throws Exception {
        // SQL: "INSERT INTO orders(uid, total_amount) VALUES (?, ?)"
        // Implement logic: Use `Statement.RETURN_GENERATED_KEYS` to get the `oid` and return it.
        String sql = "INSERT INTO orders(uid, total_amount) VALUES (?, ?)";
        try (Connection con = DButil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, order.getUid());
            ps.setDouble(2, order.getTotalAmount());
            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getInt(1); // Return the generated oid
                }
            }
            return 0;
        }
    }

    @Override
    public Order findOrderById(int orderId) throws Exception {
        // SQL: "SELECT * FROM orders WHERE oid = ?"
        // Implement logic: execute query, map to Order object.
        return null; // Stub
    }

    @Override
    public List<Order> findOrdersByUserId(int userId) throws Exception {
        // SQL: "SELECT * FROM orders WHERE uid = ?"
        // Implement logic: execute query, loop, map to Order list.
        List<Order> orders = new ArrayList<>();
        String sql = "SELECT * FROM orders WHERE uid = ?";
        try (Connection con = DButil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, userId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    orders.add(mapResultSetToOrder(rs));
                }
            }
        }
        return orders;
    }

    @Override
    public List<Order> findAllOrders() throws Exception {
        // SQL: "SELECT * FROM orders"
        // Implement logic: execute query, loop, map to Order list.
        return new ArrayList<>(); // Stub
    }

    @Override
    public int updateOrderStatus(int orderId, String status) throws Exception {
        // SQL: "UPDATE orders SET status = ? WHERE oid = ?"
        // Implement logic: execute update.
        String sql = "UPDATE orders SET status = ? WHERE oid = ?";
        try (Connection con = DButil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, status);
            ps.setInt(2, orderId);
            return ps.executeUpdate();
        }
    }

    @Override
    public int saveOrderDetail(OrderDetail detail) throws Exception {
        // SQL: "INSERT INTO orderdetails(oid, fid, quantity) VALUES (?, ?, ?)"
        // Implement logic: execute update.
        String sql = "INSERT INTO orderdetails(oid, fid, quantity) VALUES (?, ?, ?)";
        try (Connection con = DButil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, detail.getOid());
            ps.setInt(2, detail.getFid());
            ps.setInt(3, detail.getQuantity());
            return ps.executeUpdate();
        }
    }

    @Override
    public List<OrderDetail> findOrderDetailsByOrderId(int orderId) throws Exception {
        // SQL: "SELECT * FROM orderdetails WHERE oid = ?"
        // Implement logic: execute query, loop, map to OrderDetail list.
        return new ArrayList<>(); // Stub
    }

    private Order mapResultSetToOrder(ResultSet rs) throws Exception {
        Order order = new Order();
        order.setOid(rs.getInt("oid"));
        order.setUid(rs.getInt("uid"));
        order.setOrderDate(rs.getTimestamp("odate"));
        order.setDeliveryDate(rs.getTimestamp("deldate"));
        order.setTotalAmount(rs.getDouble("total_amount"));
        order.setStatus(rs.getString("status"));
        return order;
    }
}
