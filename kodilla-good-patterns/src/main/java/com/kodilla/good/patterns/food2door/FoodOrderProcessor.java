package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.interfaces.DeliversService;
import com.kodilla.good.patterns.food2door.interfaces.OrderRepository;
import com.kodilla.good.patterns.food2door.interfaces.ServiceRepositoryConnector;

import java.util.HashMap;
import java.util.Map;

public class FoodOrderProcessor implements ServiceRepositoryConnector {

    private final HashMap<DeliversService, OrderRepository> serviceRepositoryConnector = new HashMap<>();


    public FoodOrderProcessor() {
        OrderRequestRetriever retriever = new OrderRequestRetriever(this);

        makeOrders(retriever.extraFoodRetrieve());
        makeOrders(retriever.glutenFreeRetrieve());
        makeOrders(retriever.healthyGroupRetrieve());
    }

    private void makeOrders(OrderRequest request) {
        DeliveryProcessor processor = new DeliveryProcessor(request.getDeliver(),
                chooseRepository(serviceRepositoryConnector, request), new SmsService());
        processor.processOrder(request);
    }

    @Override
    public void addRepositoryToList(DeliversService deliversService, OrderRepository orderRepository) {
        serviceRepositoryConnector.put(deliversService, orderRepository);
    }

    private static OrderRepository chooseRepository(HashMap<DeliversService, OrderRepository> repositoriesMap,
                                                    OrderRequest request) {
        return repositoriesMap.entrySet().stream()
                .filter(entry -> entry.getKey() == request.getDeliver())
                .map(Map.Entry::getValue).findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
