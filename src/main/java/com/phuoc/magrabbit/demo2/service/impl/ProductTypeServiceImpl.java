package com.phuoc.magrabbit.demo2.service.impl;

import com.phuoc.magrabbit.demo2.model.Product;
import com.phuoc.magrabbit.demo2.model.ProductType;
import com.phuoc.magrabbit.demo2.repository.ProductRepository;
import com.phuoc.magrabbit.demo2.repository.ProductTypeRepository;
import com.phuoc.magrabbit.demo2.service.ProductService;
import com.phuoc.magrabbit.demo2.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    private ProductTypeRepository productTypeRepository;


    @Override
    public List<ProductType> selectAll() {
        return productTypeRepository.findAll();
    }

    @Override
    public Optional<ProductType> findById(Integer id) {
        return productTypeRepository.findById(id);
    }

    @Override
    public void save(ProductType productType) {
        productTypeRepository.save(productType);
    }

    @Override
    public void delete(Integer id) {
        productTypeRepository.deleteById(id);
    }
}
