package com.kodilla.good.patterns.challenges.onlineShop;

public class Main {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderProcess productOrderProcess = new ProductOrderProcess(new InformationServiceImpl(orderRequest.getOrder()),
                new OrderServiceImpl(orderRequest.getOrder(), orderRequest.getCustomer()));
        productOrderProcess.process(orderRequest);
    }
}
