package com.phuoc.magrabbit.demo2.service.impl;

import com.phuoc.magrabbit.demo2.model.Ingredients;
import com.phuoc.magrabbit.demo2.repository.IngredientRepository;
import com.phuoc.magrabbit.demo2.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientServiceImpl implements IngredientService {

    @Autowired
    private IngredientRepository ingredientRepository;
    @Override
    public List<Ingredients> selectAll() {
        return ingredientRepository.findAll();
    }

    @Override
    public Optional<Ingredients> findById(Integer id) {
        return ingredientRepository.findById(id);
    }

    @Override
    public void save(Ingredients ingredients) {
        ingredientRepository.save(ingredients);
    }

    @Override
    public void delete(Integer id) {
        ingredientRepository.deleteById(id);
    }
}
