package com.phuoc.magrabbit.demo2.service.impl;

import com.phuoc.magrabbit.demo2.model.Unit;
import com.phuoc.magrabbit.demo2.repository.UnitRepository;
import com.phuoc.magrabbit.demo2.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnitServiceImpl implements UnitService {

    @Autowired
    private UnitRepository unitRepository;

    @Override
    public List<Unit> selectAll() {
        return unitRepository.findAll();
    }

    @Override
    public Optional<Unit> findById(Integer id) {
        return unitRepository.findById(id);
    }

    @Override
    public void save(Unit unit) {
        unitRepository.save(unit);
    }

    @Override
    public void delete(Integer id) {
        unitRepository.deleteById(id);
    }
}
