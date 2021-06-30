package com.phuoc.magrabbit.demo2.service.impl;

import com.phuoc.magrabbit.demo2.model.Table;
import com.phuoc.magrabbit.demo2.repository.TableRepository;
import com.phuoc.magrabbit.demo2.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TableServiceImpl implements TableService {

    @Autowired
    private TableRepository tableRepository;

    @Override
    public List<Table> selectAll() {
        return tableRepository.findAll();
    }

    @Override
    public Optional<Table> findById(Integer id) {
        return tableRepository.findById(id);
    }

    @Override
    public void save(Table table) {
        tableRepository.save(table);
    }

    @Override
    public void delete(Integer id) {
        tableRepository.deleteById(id);
    }
}
