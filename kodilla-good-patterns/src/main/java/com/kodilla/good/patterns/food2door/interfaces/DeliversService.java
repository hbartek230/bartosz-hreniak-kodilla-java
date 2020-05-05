package com.kodilla.good.patterns.food2door.interfaces;

import com.kodilla.good.patterns.food2door.User;

public interface DeliversService {
    boolean process(User user, String productName, int amount, int price);
}
