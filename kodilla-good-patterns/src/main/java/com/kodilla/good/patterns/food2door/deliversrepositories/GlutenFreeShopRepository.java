package com.kodilla.good.patterns.food2door.deliversrepositories;

import com.kodilla.good.patterns.food2door.interfaces.OrderRepository;

public class GlutenFreeShopRepository implements OrderRepository {
    @Override
    public void createOrder() {
        System.out.println("Gluten Free Shop has a new product to delivery");
    }
}
