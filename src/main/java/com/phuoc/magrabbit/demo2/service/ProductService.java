package com.phuoc.magrabbit.demo2.service;

import com.phuoc.magrabbit.demo2.model.Account;
import com.phuoc.magrabbit.demo2.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> selectAll();

    Optional<Product> findById(Integer id);

    void save(Product product);

    void delete(Integer id);
}
