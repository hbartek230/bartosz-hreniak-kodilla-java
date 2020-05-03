package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.interfaces.DeliversService;
import com.kodilla.good.patterns.food2door.interfaces.MessageService;
import com.kodilla.good.patterns.food2door.interfaces.OrderRepository;

public class DeliveryProcessor {

    private final DeliversService deliversService;
    private final OrderRepository orderRepository;
    private final MessageService messageService;

    public DeliveryProcessor(DeliversService deliversService, OrderRepository orderRepository, MessageService messageService) {
        this.deliversService = deliversService;
        this.orderRepository = orderRepository;
        this.messageService = messageService;
    }

    public void processOrder(OrderRequest request){
        if(deliversService.process(request.getUser(), request.getProductName(), request.getAmount(),
                request.getPrice())){
            orderRepository.createOrder();
            messageService.sendMessage(request.getUser());
        }
    }
}
