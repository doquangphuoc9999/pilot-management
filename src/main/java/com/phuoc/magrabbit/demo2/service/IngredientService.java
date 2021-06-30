package com.phuoc.magrabbit.demo2.service;

import com.phuoc.magrabbit.demo2.model.Account;
import com.phuoc.magrabbit.demo2.model.Ingredients;

import java.util.List;
import java.util.Optional;

public interface IngredientService {
    List<Ingredients> selectAll();

    Optional<Ingredients> findById(Integer id);

    void save(Ingredients ingredients);

    void delete(Integer id);
}
