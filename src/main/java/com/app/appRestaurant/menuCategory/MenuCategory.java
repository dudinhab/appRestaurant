package com.app.appRestaurant.menuCategory;

import com.app.appRestaurant.menuItem.MenuItem;
import jakarta.persistence.*;

import java.util.List;

@Entity(name = "menu_category")
public class MenuCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private Boolean available;

    @OneToMany(mappedBy = "menuCategory")
    private List<MenuItem> menuItemList;
}
