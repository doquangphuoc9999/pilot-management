package com.phuoc.magrabbit.demo2.model;

import com.phuoc.magrabbit.demo2.model.en.Authorization;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.Arrays;
import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "accounts")
public class Account{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "fullname")
    private String fullname;

    @Transient
    private CommonsMultipartFile imageAccount;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "authorization")
    @Enumerated(EnumType.STRING)
    private Authorization authorization;


}
