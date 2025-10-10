package com.Sunbeam.daos;

import com.Sunbeam.pojos.OrderDetail;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderDetailRowMapper implements RowMapper<OrderDetail> {
    @Override
    public OrderDetail mapRow(ResultSet rs, int rowNum) throws SQLException {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOid(rs.getInt("oid"));
        orderDetail.setFid(rs.getInt("fid"));
        orderDetail.setQuantity(rs.getInt("quantity"));
        return orderDetail;
    }
}
