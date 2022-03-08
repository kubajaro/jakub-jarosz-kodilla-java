package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequest {
    private Supplier supplier;
    private Order order;

    public OrderRequest(Supplier supplier, Order order) {
        this.supplier = supplier;
        this.order = order;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Order getOrder() {
        return order;
    }
}
