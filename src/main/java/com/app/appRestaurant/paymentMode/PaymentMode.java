package com.app.appRestaurant.paymentMode;

import com.app.appRestaurant.order.Order;
import jakarta.persistence.*;

@Entity
@Table(name = "payment_mode")
public class PaymentMode {
    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name = "order")
    private Order order;
}
