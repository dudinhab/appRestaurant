package com.app.appRestaurant.customer;

import com.app.appRestaurant.order.Order;
import jakarta.persistence.*;

import java.util.List;

@Entity(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String score;
    @Column
    private String email;
    @Column
    private String address;

    @OneToMany(mappedBy = "customer")
    private List<Order> orderList;
}
