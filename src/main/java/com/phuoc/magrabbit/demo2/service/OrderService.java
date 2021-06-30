package com.phuoc.magrabbit.demo2.service;

import com.phuoc.magrabbit.demo2.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<Order> selectAll();

    Optional<Order> findById(Integer id);

    void save(Order order);

    void delete(Integer id);
}
