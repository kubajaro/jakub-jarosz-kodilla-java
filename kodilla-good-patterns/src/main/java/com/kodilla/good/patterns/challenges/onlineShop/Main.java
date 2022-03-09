package com.kodilla.good.patterns.challenges.onlineShop;

public class Main {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderProcess productOrderProcess = new ProductOrderProcess(new InformationServiceImpl(),
                new OrderServiceImpl());
        productOrderProcess.process(orderRequest);
    }
}
