package com.phuoc.magrabbit.demo2.service;

import com.phuoc.magrabbit.demo2.model.ProductType;

import java.util.List;
import java.util.Optional;

public interface ProductTypeService {
    List<ProductType> selectAll();

    Optional<ProductType> findById(Integer id);

    void save(ProductType productType);

    void delete(Integer id);
}
