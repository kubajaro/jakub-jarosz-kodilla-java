package com.kodilla.good.patterns.challenges.onlineShop;

public class InformationServiceImpl implements InformationService{
    @Override
    public void sendOrderStatusNotification(Order order) {
        System.out.println("Order " + order.getOrderNumber() + " is in status: " + order.getOrderStatus());
    }
}
