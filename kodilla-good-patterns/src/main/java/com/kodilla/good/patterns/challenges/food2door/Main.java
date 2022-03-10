package com.kodilla.good.patterns.challenges.food2door;

public class Main {
    public static void main(String[] args) {
        OrderRequest orderRequest = new OrderRequest();

        OrderService orderService = new OrderService();
        orderService.assignSupplierToOrder(orderRequest.orderRequest());
    }
}
