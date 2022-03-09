package com.kodilla.good.patterns.challenges.onlineShop;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    @Override
    public void changeOrderStatus(Order order) {
        if(order.getOrderedProducts().size() != 0){
            order.setOrderStatus("In progress...");
        }
    }

}
