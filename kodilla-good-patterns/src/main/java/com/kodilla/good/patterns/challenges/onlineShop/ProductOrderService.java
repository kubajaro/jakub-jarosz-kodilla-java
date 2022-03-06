package com.kodilla.good.patterns.challenges.onlineShop;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;

    public ProductOrderService(InformationService informationService, OrderService orderService) {
        this.informationService = informationService;
        this.orderService = orderService;
    }

    public OrderDto process(){

        return null;

    }
}
