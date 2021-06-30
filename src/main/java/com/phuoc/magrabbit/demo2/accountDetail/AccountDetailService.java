//package com.phuoc.magrabbit.demo2.accountDetail;
//
//import com.phuoc.magrabbit.demo2.model.Account;
//import com.phuoc.magrabbit.demo2.repository.AccountRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class AccountDetailService implements UserDetailsService {
//
//    @Autowired
//    AccountRepository accountRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        Account account = accountRepository.findByUsername(s).orElse(null);
//        if (account == null){
//            throw new UsernameNotFoundException("Could not find user");
//        }
//        return new MyAccountDetail(account);
//    }
//}
