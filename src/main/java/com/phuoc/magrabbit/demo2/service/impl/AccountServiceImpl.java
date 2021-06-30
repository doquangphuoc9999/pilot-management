package com.phuoc.magrabbit.demo2.service.impl;

import com.phuoc.magrabbit.demo2.model.Account;
import com.phuoc.magrabbit.demo2.repository.AccountRepository;
import com.phuoc.magrabbit.demo2.service.AccoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccoutService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account findAllByUsername(String name) {
        return accountRepository.findByUsername(name).orElse(null);
    }

    @Override
    public List<Account> selectAll() {
        return accountRepository.findAll();
    }

    @Override
    public Optional<Account> findById(Integer id) {
        return accountRepository.findById(id);
    }

    @Override
    public void save(Account account) {
        accountRepository.save(account);
    }

    @Override
    public void delete(Integer id) {
        accountRepository.deleteById(id);
    }

}
