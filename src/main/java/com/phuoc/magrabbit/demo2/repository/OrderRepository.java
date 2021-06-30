package com.phuoc.magrabbit.demo2.repository;

import com.phuoc.magrabbit.demo2.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
