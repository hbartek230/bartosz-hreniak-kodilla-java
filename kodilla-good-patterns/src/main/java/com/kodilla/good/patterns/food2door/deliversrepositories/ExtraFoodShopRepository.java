package com.kodilla.good.patterns.food2door.deliversrepositories;

import com.kodilla.good.patterns.food2door.interfaces.OrderRepository;

public class ExtraFoodShopRepository implements OrderRepository {
    @Override
    public void createOrder() {
        System.out.println("Extra Food Shop has a new product to delivery");
    }
}
