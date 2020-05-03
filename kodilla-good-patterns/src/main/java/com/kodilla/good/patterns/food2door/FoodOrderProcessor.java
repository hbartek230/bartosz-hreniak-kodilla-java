package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.interfaces.DeliversService;
import com.kodilla.good.patterns.food2door.interfaces.OrderRepository;
import com.kodilla.good.patterns.food2door.interfaces.ServiceRepositoryConnector;

import java.util.HashMap;
import java.util.Map;

public class FoodOrderProcessor implements ServiceRepositoryConnector {

    private final HashMap<DeliversService, OrderRepository> serviceRepositoryConnector = new HashMap<>();
    private final OrderRequest extraFoodRequest;
    private final OrderRequest glutenFreeRequest;
    private final OrderRequest healthyRequest;

    public FoodOrderProcessor() {
        OrderRequestRetriever retriever = new OrderRequestRetriever(this);
        extraFoodRequest = retriever.extraFoodRetrieve();
        glutenFreeRequest = retriever.glutenFreeRetrieve();
        healthyRequest = retriever.healthyGroupRetrieve();

        makeOrders();
    }

    private void makeOrders() {
        DeliveryProcessor processor = new DeliveryProcessor(extraFoodRequest.getDeliver(),
                chooseRepository(serviceRepositoryConnector, extraFoodRequest), new SmsService());
        processor.processOrder(extraFoodRequest);
        processor = new DeliveryProcessor(extraFoodRequest.getDeliver(),
                chooseRepository(serviceRepositoryConnector, glutenFreeRequest), new SmsService());
        processor.processOrder(glutenFreeRequest);
        processor = new DeliveryProcessor(extraFoodRequest.getDeliver(),
                chooseRepository(serviceRepositoryConnector, healthyRequest), new SmsService());
        processor.processOrder(healthyRequest);
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
