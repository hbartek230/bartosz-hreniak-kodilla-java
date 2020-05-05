package com.kodilla.good.patterns.food2door.deliversrepositories;

import com.kodilla.good.patterns.food2door.interfaces.OrderRepository;

public class HealthyGroupRepository implements OrderRepository {
    @Override
    public void createOrder() {
        System.out.println("Healthy Group has a new product to delivery");
    }
}
