package com.app.appRestaurant.order;

import com.app.appRestaurant.cart.Cart;
import com.app.appRestaurant.customer.Customer;
import com.app.appRestaurant.paymentMode.PaymentMode;
import jakarta.persistence.*;

@Entity
@Table(name = "order")
public class Order {
    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name = "payment_mode")
    private PaymentMode paymentMode;
    @ManyToOne
    @JoinColumn(name = "id_customer")
    private Customer customer;
    @OneToOne
    private Cart cart;
}
