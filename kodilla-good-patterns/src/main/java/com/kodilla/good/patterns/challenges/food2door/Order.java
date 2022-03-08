package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class Order {
    private List<Product> productList;
    private int orderNumber;
    private boolean isOrderPlaced;
    private boolean isOrderRealized;

    public Order(int orderNumber, List<Product> productList, boolean isOrderPlaced, boolean isOrderRealized) {
        this.orderNumber = orderNumber;
        this.productList = productList;
        this.isOrderPlaced = isOrderPlaced;
        this.isOrderRealized = isOrderRealized;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public boolean isOrderPlaced() {
        return isOrderPlaced;
    }

    public boolean isOrderRealized() {
        return isOrderRealized;
    }

    public void setOrderPlaced(boolean orderPlaced) {
        isOrderPlaced = orderPlaced;
    }

    public void setOrderRealized(boolean orderRealized) {
        isOrderRealized = orderRealized;
    }
}