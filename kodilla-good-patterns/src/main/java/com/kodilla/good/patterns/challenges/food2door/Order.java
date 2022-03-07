package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class Order {
    private Supplier supplier;
    private List<Product> productList;
    private int orderNumber;
    private boolean isOrderPlaced;
    private boolean isOrderRealized;

    public Order(Supplier supplier, List<Product> productList, boolean isOrderPlaced, boolean isOrderRealized) {
        this.supplier = supplier;
        this.productList = productList;
        this.isOrderPlaced = isOrderPlaced;
        this.isOrderRealized = isOrderRealized;
    }

    public Supplier getSupplier() {
        return supplier;
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