package com.phuoc.magrabbit.demo2.service.impl;

import com.phuoc.magrabbit.demo2.model.Area;
import com.phuoc.magrabbit.demo2.repository.AreaRepository;
import com.phuoc.magrabbit.demo2.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaRepository areaRepository;

    @Override
    public List<Area> selectAll() {
        return areaRepository.findAll();
    }

    @Override
    public Optional<Area> findById(Integer id) {
        return areaRepository.findById(id);
    }

    @Override
    public void save(Area area) {
        areaRepository.save(area);
    }

    @Override
    public void delete(Integer id) {
        areaRepository.deleteById(id);
    }
}
