package com.phuoc.magrabbit.demo2.repository;

import com.phuoc.magrabbit.demo2.model.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredients,Integer> {
}
