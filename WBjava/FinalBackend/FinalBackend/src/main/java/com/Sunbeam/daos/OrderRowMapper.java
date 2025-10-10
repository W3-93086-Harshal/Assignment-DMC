package com.Sunbeam.daos;

import com.Sunbeam.pojos.Order;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderRowMapper implements RowMapper<Order> {
    @Override
    public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
        Order order = new Order();
        order.setOid(rs.getInt("oid"));
        order.setUid(rs.getInt("uid"));
        order.setOdate(rs.getTimestamp("odate"));
        order.setDeldate(rs.getTimestamp("deldate"));
        order.setTotal_amount(rs.getDouble("total_amount"));
        order.setStatus(rs.getString("status"));
        return order;
    }
}
