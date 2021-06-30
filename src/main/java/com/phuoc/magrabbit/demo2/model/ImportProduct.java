package com.phuoc.magrabbit.demo2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ImportProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nameTypeProduct;

    private LocalDateTime productImportDate;

    private Integer quantity;

    private Long price;

    private Long totalPrice;

    private String comment;

    @JsonIgnore
    @OneToMany(mappedBy = "importProduct")
    private List<Product> products;
}
