package com.kodilla.good.patterns.challenges.onlineShop;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    private Order order;
    private Customer customer;

    public OrderServiceImpl(Order order, Customer customer) {
        this.order = order;
        this.customer = customer;
    }

    @Override
    public void changeOrderStatus() {
        if(order.getOrderedProducts().size() != 0){
            order.setOrderStatus("In progress...");
        }
    }

}
