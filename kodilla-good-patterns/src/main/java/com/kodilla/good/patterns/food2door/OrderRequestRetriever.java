package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.delivercompanies.ExtraFoodShop;
import com.kodilla.good.patterns.food2door.delivercompanies.GlutenFreeShop;
import com.kodilla.good.patterns.food2door.delivercompanies.HealthyGroup;
import com.kodilla.good.patterns.food2door.interfaces.DeliversService;
import com.kodilla.good.patterns.food2door.interfaces.ServiceRepositoryConnector;

public class OrderRequestRetriever {

    private ServiceRepositoryConnector repository;

    public OrderRequestRetriever(ServiceRepositoryConnector repository) {
        this.repository = repository;
    }

    public OrderRequest extraFoodRetrieve() {
        DeliversService deliver = new ExtraFoodShop(repository);
        User user = new User("Mark", "Anthony");
        String productName = "pancakes";
        int amount = 3;
        int price = 18;

        return new OrderRequest(deliver, user, productName, amount, price);
    }

    public OrderRequest glutenFreeRetrieve() {
        DeliversService deliver = new GlutenFreeShop(repository);
        User user = new User("Tom", "Jones");
        String productName = "greek salad";
        int amount = 1;
        int price = 12;

        return new OrderRequest(deliver, user, productName, amount, price);
    }

    public OrderRequest healthyGroupRetrieve() {
        DeliversService deliver = new HealthyGroup(repository);
        User user = new User("Andrew", "Thomson");
        String productName = "fish & rice";
        int amount = 1;
        int price = 22;

        return new OrderRequest(deliver, user, productName, amount, price);
    }

}
