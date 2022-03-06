package com.kodilla.good.patterns.challenges.onlineShop;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    private Order order;

    public OrderServiceImpl(Order order) {
        this.order = order;
    }

    @Override
    public void changeOrderStatus() {
        if(createFinalOrder().size() != 0){
            order.setOrderStatus("In progress...");
        }
    }

    @Override
    public List<Product> createFinalOrder() {
        List<Product> finalOrderList = order.getOrderedProducts();

        for(Product product: finalOrderList) {
            if(!product.isAvailability()) {
                finalOrderList.remove(product);
            }
        }
        return finalOrderList;
    }
}
