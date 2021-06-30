package com.phuoc.magrabbit.demo2.service;

import com.phuoc.magrabbit.demo2.model.Account;
import com.phuoc.magrabbit.demo2.model.Table;

import java.util.List;
import java.util.Optional;

public interface TableService {
    List<Table> selectAll();

    Optional<Table> findById(Integer id);

    void save(Table table);

    void delete(Integer id);
}
