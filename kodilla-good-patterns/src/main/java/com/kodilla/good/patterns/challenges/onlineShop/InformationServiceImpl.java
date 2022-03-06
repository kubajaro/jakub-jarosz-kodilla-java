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

    @Override
    public void informIfProductUnavailable() {
        for(Product product: order.getOrderedProducts()){
            if(!product.isAvailability()){
                System.out.println("The ordered product " + product.getProducer() + product.getModel() +
                        " is currently unavailable. Your oder");
            }
        }
    }
}
