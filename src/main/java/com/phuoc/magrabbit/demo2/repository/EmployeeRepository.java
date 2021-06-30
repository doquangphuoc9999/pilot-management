package com.phuoc.magrabbit.demo2.repository;

import com.phuoc.magrabbit.demo2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
