package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class Order {
    private Supplier supplier;
    private List<Product> productList;
    private int orderNumber;
    private boolean isOrderPlaced;

    public Order(Supplier supplier, List<Product> productList, boolean isOrderPlaced) {
        this.supplier = supplier;
        this.productList = productList;
        this.isOrderPlaced = isOrderPlaced;
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

    public void setOrderPlaced(boolean orderPlaced) {
        isOrderPlaced = orderPlaced;
    }
}
