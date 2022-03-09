package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {
    private Supplier supplier;
    private OrderAssigner orderAssigner = new OrderAssigner();

    public OrderDto orderProcessor(Order order){
        supplier = orderAssigner.assignedSupplier(order);
        supplier.process(order);

        return new OrderDto(supplier, order);
    }
}
