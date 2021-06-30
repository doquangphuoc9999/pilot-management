package com.phuoc.magrabbit.demo2.service;

import com.phuoc.magrabbit.demo2.model.Account;
import com.phuoc.magrabbit.demo2.model.ImportIngredient;

import java.util.List;
import java.util.Optional;

public interface ImportIngredientService {
    List<ImportIngredient> selectAll();

    Optional<ImportIngredient> findById(Integer id);

    void save(ImportIngredient importIngredient);

    void delete(Integer id);
}
