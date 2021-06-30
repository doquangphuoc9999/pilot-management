package com.phuoc.magrabbit.demo2.service;

import com.phuoc.magrabbit.demo2.model.Area;
import com.phuoc.magrabbit.demo2.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> selectAll();

    Optional<Employee> findById(Integer id);

    void save(Employee employee);

    void delete(Integer id);
}
