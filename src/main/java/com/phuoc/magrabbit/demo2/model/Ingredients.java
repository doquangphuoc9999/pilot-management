package com.phuoc.magrabbit.demo2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Ingredients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nameIngredient;

    @ManyToOne
    private Unit unit;

    private String comment;

    @ManyToOne
    private ImportIngredient importIngredient;
}
