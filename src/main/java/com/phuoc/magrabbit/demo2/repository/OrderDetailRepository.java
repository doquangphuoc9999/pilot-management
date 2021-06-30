package com.phuoc.magrabbit.demo2.repository;

import com.phuoc.magrabbit.demo2.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail,Integer> {
}
