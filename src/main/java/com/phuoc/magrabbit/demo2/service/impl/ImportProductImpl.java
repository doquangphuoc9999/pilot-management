package com.phuoc.magrabbit.demo2.service.impl;

import com.phuoc.magrabbit.demo2.model.ImportProduct;
import com.phuoc.magrabbit.demo2.repository.ImportProductRepository;
import com.phuoc.magrabbit.demo2.service.ImportProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImportProductImpl implements ImportProductService {
    @Autowired
    private ImportProductRepository importProductRepository;

    @Override
    public List<ImportProduct> selectAll() {
        return importProductRepository.findAll();
    }

    @Override
    public Optional<ImportProduct> findById(Integer id) {
        return importProductRepository.findById(id);
    }

    @Override
    public void save(ImportProduct importProduct) {
        importProductRepository.save(importProduct);
    }

    @Override
    public void delete(Integer id) {
        importProductRepository.deleteById(id);
    }
}
