package com.geekster.EcommerceApi.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    private int productQuantity;


    @OneToOne
    @JoinColumn(name = "user_user_id")
    private User user;
    @OneToOne
    @JoinColumn(name = "address_address_id")
    private Address address;
    @OneToOne
    @JoinColumn(name = "product_product_id")
    private Product product;
}
