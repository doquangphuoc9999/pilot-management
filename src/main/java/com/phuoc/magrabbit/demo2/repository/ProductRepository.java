package com.phuoc.magrabbit.demo2.repository;

import com.phuoc.magrabbit.demo2.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
