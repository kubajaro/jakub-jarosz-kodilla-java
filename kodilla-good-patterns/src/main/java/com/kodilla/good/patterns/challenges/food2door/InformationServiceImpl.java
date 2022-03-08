package com.kodilla.good.patterns.challenges.food2door;

public class InformationServiceImpl implements InformationService{
    private Order order;

    public InformationServiceImpl(Order order) {
        this.order = order;
    }

    @Override
    public void orderPlacedInformation() {
        if(order.isOrderPlaced())
            System.out.println("Order " + order.getOrderNumber() + " was placed in our system.");
    }

    @Override
    public void orderRealizedInformation() {
        if(order.isOrderRealized())
            System.out.println("Order realized");
    }
}
