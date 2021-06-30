package com.phuoc.magrabbit.demo2.repository;

import com.phuoc.magrabbit.demo2.model.Table;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableRepository extends JpaRepository<Table,Integer> {
}
