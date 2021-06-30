package com.phuoc.magrabbit.demo2.repository;

import com.phuoc.magrabbit.demo2.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductTypeRepository extends JpaRepository<ProductType,Integer> {
}
