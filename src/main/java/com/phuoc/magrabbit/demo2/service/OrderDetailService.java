package com.phuoc.magrabbit.demo2.service;

import com.phuoc.magrabbit.demo2.model.Account;
import com.phuoc.magrabbit.demo2.model.OrderDetail;

import java.util.List;
import java.util.Optional;

public interface OrderDetailService {
    List<OrderDetail> selectAll();

    Optional<OrderDetail> findById(Integer id);

    void save(OrderDetail orderDetail);

    void delete(Integer id);
}
