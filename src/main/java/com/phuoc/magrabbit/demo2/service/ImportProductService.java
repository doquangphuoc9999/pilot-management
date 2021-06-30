package com.phuoc.magrabbit.demo2.service;

import com.phuoc.magrabbit.demo2.model.Account;
import com.phuoc.magrabbit.demo2.model.ImportProduct;

import java.util.List;
import java.util.Optional;

public interface ImportProductService {
    List<ImportProduct> selectAll();

    Optional<ImportProduct> findById(Integer id);

    void save(ImportProduct importProduct);

    void delete(Integer id);
}
