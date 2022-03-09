package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class Order {
    private String orderType;
    private List<Product> productList;
    private boolean processed;

    public Order(String orderType, List<Product> productList, boolean processed) {
        this.orderType = orderType;
        this.productList = productList;
        this.processed = processed;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }
}
