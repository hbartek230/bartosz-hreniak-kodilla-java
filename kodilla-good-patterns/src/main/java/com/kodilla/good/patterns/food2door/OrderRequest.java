package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.interfaces.DeliversService;

public class OrderRequest {

    private DeliversService deliver;
    private User user;
    private String productName;
    private int amount;
    private int price;

    public OrderRequest(DeliversService deliver, User user, String productName, int amount, int price) {
        this.deliver = deliver;
        this.user = user;
        this.productName = productName;
        this.amount = amount;
        this.price = price;
    }

    public DeliversService getDeliver() {
        return deliver;
    }

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
