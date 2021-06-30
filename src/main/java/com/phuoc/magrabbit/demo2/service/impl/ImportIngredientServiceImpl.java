package com.phuoc.magrabbit.demo2.service.impl;

import com.phuoc.magrabbit.demo2.model.ImportIngredient;
import com.phuoc.magrabbit.demo2.repository.ImportIngredientRepository;
import com.phuoc.magrabbit.demo2.service.ImportIngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImportIngredientServiceImpl implements ImportIngredientService {

    @Autowired
    private ImportIngredientRepository importIngredientRepository;

    @Override
    public List<ImportIngredient> selectAll() {
        return importIngredientRepository.findAll();
    }

    @Override
    public Optional<ImportIngredient> findById(Integer id) {
        return importIngredientRepository.findById(id);
    }

    @Override
    public void save(ImportIngredient importIngredient) {
        importIngredientRepository.save(importIngredient);
    }

    @Override
    public void delete(Integer id) {
        importIngredientRepository.deleteById(id);
    }
}
