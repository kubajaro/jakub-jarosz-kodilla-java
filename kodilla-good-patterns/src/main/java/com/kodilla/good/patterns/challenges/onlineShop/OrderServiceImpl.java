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
        if(createFinalOrderedProductList().size() != 0){
            order.setOrderStatus("In progress...");
        }
    }

    @Override
    public List<Product> createFinalOrderedProductList() {
        List<Product> finalOrderList = order.getOrderedProducts();

        for(Product product: finalOrderList) {
            if(!product.isAvailability()) {
                finalOrderList.remove(product);
            }
        }
        return finalOrderList;
    }
}
