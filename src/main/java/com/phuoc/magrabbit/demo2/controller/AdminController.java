package com.phuoc.magrabbit.demo2.controller;

import com.phuoc.magrabbit.demo2.model.ProductType;
import com.phuoc.magrabbit.demo2.repository.AccountRepository;
import com.phuoc.magrabbit.demo2.repository.ProductTypeRepository;
import com.phuoc.magrabbit.demo2.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    private ProductTypeService productTypeService;


    @GetMapping
    public String admin(){
        return "admins/index";
    }

    @GetMapping("/listProduct")
    public String listProduct(Model model){
        List<ProductType> productTypes = productTypeService.selectAll();
        model.addAttribute("productTypes", productTypes);
        return "admins/listProduct";
    }
}
