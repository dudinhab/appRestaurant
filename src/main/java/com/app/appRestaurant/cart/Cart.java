package com.app.appRestaurant.cart;

import com.app.appRestaurant.itemCart.ItemCart;
import com.app.appRestaurant.menuItem.MenuItem;
import com.app.appRestaurant.order.Order;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    private Long id;
    @Column
    private Double value;

    @OneToMany(mappedBy = "cart")
    private List<ItemCart> itemCartList;
    @OneToOne
    private Order order;
}
