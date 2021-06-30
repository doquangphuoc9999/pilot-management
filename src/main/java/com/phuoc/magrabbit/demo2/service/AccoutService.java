package com.phuoc.magrabbit.demo2.service;

import com.phuoc.magrabbit.demo2.model.Account;

import java.util.List;
import java.util.Optional;

public interface AccoutService {
    public Account findAllByUsername(String name);

    List<Account> selectAll();

    Optional<Account> findById(Integer id);

    void save(Account account);

    void delete(Integer id);


}
