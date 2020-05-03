package com.kodilla.good.patterns.challenges.orderservice;

import com.kodilla.good.patterns.challenges.orderservice.interfaces.MessageService;
import com.kodilla.good.patterns.challenges.orderservice.interfaces.ProductOrderRepository;
import com.kodilla.good.patterns.challenges.orderservice.interfaces.ProductOrderService;

public class OrderProcessor {

    private final ProductOrderService orderService;
    private final ProductOrderRepository orderRepository;
    private final MessageService messageService;

    public OrderProcessor(ProductOrderService orderService, ProductOrderRepository orderRepository, MessageService messageService) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.messageService = messageService;
    }

    public OrderDto process(OrderRequest request) {
        boolean isOrdered = orderService.order(request.getUser(), request.getProductName(), request.getAmount(),
                request.getPrice());

        if (isOrdered){
            messageService.sendMessage(request.getUser());
            orderRepository.createOrder();
            return new OrderDto(request.getUser(), true);
        }else {
            return new OrderDto(request.getUser(), false);
        }
    }
}
