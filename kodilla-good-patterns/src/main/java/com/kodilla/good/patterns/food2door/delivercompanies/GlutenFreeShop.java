package com.kodilla.good.patterns.food2door.delivercompanies;

import com.kodilla.good.patterns.food2door.User;
import com.kodilla.good.patterns.food2door.deliversrepositories.GlutenFreeShopRepository;
import com.kodilla.good.patterns.food2door.interfaces.DeliversService;
import com.kodilla.good.patterns.food2door.interfaces.ServiceRepositoryConnector;

public class GlutenFreeShop implements DeliversService {

    public GlutenFreeShop(ServiceRepositoryConnector connector){
        connector.addRepositoryToList(this, new GlutenFreeShopRepository());
    }

    @Override
    public boolean process(User user, String productName, int amount, int price) {
        System.out.println("User " + user.getName() + " " + user.getSurname() + " ordered " + productName + ": "
                + amount + " pieces. Price to pay is: $" + price);
        return true;
    }
}
