package com.kodilla.good.patterns.challenges.food2door;

public class OrderDto {
    private Supplier supplier;
    private Order order;

    public OrderDto(Supplier supplier, Order order) {
        this.supplier = supplier;
        this.order = order;
    }
}
