package com.kodilla.good.patterns.challenges.onlineShop;

public class InformationServiceImpl implements InformationService{
    private Order order;

    public InformationServiceImpl(final Order order) {
        this.order = order;
    }

    @Override
    public void sendOrderStatusNotification() {
        System.out.println("Order " + order.getOrderNumber() + " is in status: " + order.getOrderStatus());
    }
}
