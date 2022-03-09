package com.kodilla.good.patterns.challenges.food2door;

public class Main {
    public static void main(String[] args) {
        OrderRequest orderRequest = new OrderRequest();

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.orderProcessor(orderRequest.orderRequest());
    }
}
