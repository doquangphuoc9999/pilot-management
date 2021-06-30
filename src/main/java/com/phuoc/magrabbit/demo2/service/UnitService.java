package com.phuoc.magrabbit.demo2.service;

import com.phuoc.magrabbit.demo2.model.Account;
import com.phuoc.magrabbit.demo2.model.Unit;

import java.util.List;
import java.util.Optional;

public interface UnitService {
    List<Unit> selectAll();

    Optional<Unit> findById(Integer id);

    void save(Unit unit);

    void delete(Integer id);
}
