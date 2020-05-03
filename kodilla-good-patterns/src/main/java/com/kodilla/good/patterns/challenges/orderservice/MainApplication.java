package com.kodilla.good.patterns.challenges.orderservice;

public class MainApplication {

    public static void main(String[] args) {
        OrderRequestRetriever retriever = new OrderRequestRetriever();
        OrderRequest orderRequest = retriever.retrieve();

        OrderProcessor processor = new OrderProcessor(new GameOrderService(), new GameOrderRepository(),
                new MailMessageService());
        processor.process(orderRequest);
    }
}