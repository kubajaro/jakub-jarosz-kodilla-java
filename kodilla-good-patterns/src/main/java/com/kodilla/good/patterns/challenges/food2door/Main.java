package com.kodilla.good.patterns.challenges.food2door;

public class Main {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.orderRequest();

        OrderProcessor orderProcessor = new OrderProcessor(new InformationServiceImpl(orderRequest.getOrder(),
                orderRequest.getSupplier()), new OrderServiceImpl(orderRequest.getOrder()));
        orderProcessor.process(orderRequest);
    }
}
