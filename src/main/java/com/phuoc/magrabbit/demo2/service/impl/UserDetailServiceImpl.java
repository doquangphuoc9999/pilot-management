//package com.phuoc.magrabbit.demo2.service.impl;
//
//import com.phuoc.magrabbit.demo2.model.Account;
//import com.phuoc.magrabbit.demo2.repository.AccountRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//@Service("userDetailsServiceImpl")
//@Transactional
//public class UserDetailServiceImpl implements UserDetailsService {
//
//    @Autowired
//    private AccountRepository accountRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        Account accountOptional =  accountRepository.findByUsername(s);
//
//        if(accountOptional == null){
//            throw new UsernameNotFoundException("Account not found");
//        }
//        Set<GrantedAuthority> authorities = new HashSet<>();
//        String authorization = String.valueOf(accountOptional.getAuthorization());
//        authorities.add(new SimpleGrantedAuthority(authorization));
//        return new org.springframework.security.core.userdetails.User(accountOptional.getUsername(), accountOptional.getPassword(), authorities);
//    }
//
//
//}
