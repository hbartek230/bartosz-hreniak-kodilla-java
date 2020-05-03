package com.kodilla.good.patterns.challenges.orderservice.interfaces;

import com.kodilla.good.patterns.challenges.orderservice.User;

public interface ProductOrderService {

    boolean order(User user, String productName, int amount, int price);
}
