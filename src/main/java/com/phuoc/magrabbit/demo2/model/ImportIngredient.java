package com.phuoc.magrabbit.demo2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ImportIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nameIngredient;

    private LocalDateTime ingerdientImportDate;

    private Long price;

    private Long quantity;

    private Long totalPrice;

    private String comment;

    @OneToMany(mappedBy = "importIngredient")
    private List<Ingredients> ingredients;

}
