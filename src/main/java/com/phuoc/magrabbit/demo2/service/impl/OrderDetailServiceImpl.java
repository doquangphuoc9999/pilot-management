package com.phuoc.magrabbit.demo2.service.impl;

import com.phuoc.magrabbit.demo2.model.Order;
import com.phuoc.magrabbit.demo2.model.OrderDetail;
import com.phuoc.magrabbit.demo2.repository.OrderDetailRepository;
import com.phuoc.magrabbit.demo2.service.OrderDetailService;
import com.phuoc.magrabbit.demo2.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {
    @Autowired
    private OrderDetailRepository orderDetailRepository;


    @Override
    public List<OrderDetail> selectAll() {
        return orderDetailRepository.findAll();
    }

    @Override
    public Optional<OrderDetail> findById(Integer id) {
        return orderDetailRepository.findById(id);
    }

    @Override
    public void save(OrderDetail orderDetail) {
        orderDetailRepository.save(orderDetail);
    }

    @Override
    public void delete(Integer id) {
        orderDetailRepository.deleteById(id);
    }
}
