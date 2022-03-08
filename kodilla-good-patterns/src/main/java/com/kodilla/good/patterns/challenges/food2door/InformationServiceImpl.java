package com.kodilla.good.patterns.challenges.food2door;

public class InformationServiceImpl implements InformationService{
    private Order order;
    private Supplier supplier;

    public InformationServiceImpl(Order order, Supplier supplier) {
        this.order = order;
        this.supplier = supplier;
    }

    @Override
    public void orderPlacedInformation() {
        if(order.isOrderPlaced())
            System.out.println("Supplier order " + supplier.getName() +" order "
                    + order.getOrderNumber() + " was placed in our system.");
    }

    @Override
    public void orderRealizedInformation() {
        if(order.isOrderRealized())
            System.out.println("Supplier " + supplier.getName() + " order "
                    + order.getOrderNumber() + " realized");
    }
}
