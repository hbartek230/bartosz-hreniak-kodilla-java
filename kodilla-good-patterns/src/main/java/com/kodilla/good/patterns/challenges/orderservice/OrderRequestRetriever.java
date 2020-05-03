package com.kodilla.good.patterns.challenges.orderservice;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("John", "Malkovich");
        String productName = "Java Course";
        int amount = 1;
        int price = 10000;

        return new OrderRequest(user, productName, amount, price);
    }
}