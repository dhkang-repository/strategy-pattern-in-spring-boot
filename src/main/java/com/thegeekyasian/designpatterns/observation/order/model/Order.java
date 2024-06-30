package com.thegeekyasian.designpatterns.observation.order.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;



@Data
@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderId;
    private String product;
    private int quantity;
}
