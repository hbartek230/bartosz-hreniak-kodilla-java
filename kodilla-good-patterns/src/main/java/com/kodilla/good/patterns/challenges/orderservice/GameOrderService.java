package com.kodilla.good.patterns.challenges.orderservice;

import com.kodilla.good.patterns.challenges.orderservice.interfaces.ProductOrderService;

public class GameOrderService implements ProductOrderService {

    @Override
    public boolean order(User user, String productName, int amount, int price) {
        System.out.println("Hello " + user.getName() + ", you bought " + amount + " " + productName
                + ". You need to pay $" + price);
        return true;
    }
}
