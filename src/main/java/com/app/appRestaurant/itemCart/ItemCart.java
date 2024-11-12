package com.app.appRestaurant.itemCart;

import com.app.appRestaurant.cart.Cart;
import com.app.appRestaurant.menuItem.MenuItem;
import jakarta.persistence.*;

@Entity
@Table(name = "item_cart")
public class ItemCart {
    @Id
    private Long id;
    @Column
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "id_menu_item")
    private MenuItem menuItem;
    @ManyToOne
    @JoinColumn(name = "id_cart")
    private Cart cart;
}
