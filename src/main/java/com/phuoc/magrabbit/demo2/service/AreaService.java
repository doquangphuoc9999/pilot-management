package com.phuoc.magrabbit.demo2.service;

import com.phuoc.magrabbit.demo2.model.Account;
import com.phuoc.magrabbit.demo2.model.Area;

import java.util.List;
import java.util.Optional;

public interface AreaService {
    List<Area> selectAll();

    Optional<Area> findById(Integer id);

    void save(Area area);

    void delete(Integer id);
}
