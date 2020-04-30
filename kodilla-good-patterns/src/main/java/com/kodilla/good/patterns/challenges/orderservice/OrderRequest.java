package com.kodilla.good.patterns.challenges.orderservice;

public class OrderRequest {

    private User user;
    private String productName;
    private int amount;
    private int price;

    public OrderRequest(User user, String productName, int amount, int price) {
        this.user = user;
        this.productName = productName;
        this.amount = amount;
        this.price = price;
    }

    //test

    public User getUser() {
        return user;
    }

    public String getProductName() {
        return productName;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }
}