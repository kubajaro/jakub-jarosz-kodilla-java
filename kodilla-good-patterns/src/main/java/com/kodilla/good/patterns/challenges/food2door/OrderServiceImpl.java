package com.kodilla.good.patterns.challenges.food2door;

public class OrderServiceImpl implements OrderService{
    private Order order;

    public OrderServiceImpl(Order order) {
        this.order = order;
    }

    @Override
    public void placeOrder(Order order) {
        order.setOrderPlaced(true);
    }

    @Override
    public void realizeOrder(Order order) {
        order.setOrderRealized(true);
    }
}
