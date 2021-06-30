package com.phuoc.magrabbit.demo2.model;

import com.phuoc.magrabbit.demo2.model.en.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDateTime deliverDate;

    @OneToMany(mappedBy = "order")
    List<OrderDetail> orderDetails;

    private OrderStatus orderStatus;
}
