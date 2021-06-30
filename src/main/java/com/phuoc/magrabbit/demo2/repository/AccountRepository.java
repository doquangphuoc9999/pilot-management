package com.phuoc.magrabbit.demo2.repository;

import com.phuoc.magrabbit.demo2.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Integer> {

//    @Query(value = "SELECT * FROM accounts  WHERE username = :username",nativeQuery = true)
    Optional<Account> findByUsername(String username);
}
