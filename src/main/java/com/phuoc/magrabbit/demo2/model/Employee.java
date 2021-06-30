package com.phuoc.magrabbit.demo2.model;

import com.phuoc.magrabbit.demo2.model.en.Office;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDateTime dateCreated;

    private String nameEmployee;

    private LocalDateTime dateOfbirth;

    private Integer deleted;

    private Office office;

    private Long coefficientsSalary;

}
