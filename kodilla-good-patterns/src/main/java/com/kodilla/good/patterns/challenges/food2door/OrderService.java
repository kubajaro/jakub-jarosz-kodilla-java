package com.kodilla.good.patterns.challenges.food2door;

public class OrderService {
    private OrderAssigner orderAssigner = new OrderAssigner();

    public OrderDto assignSupplierToOrder(Order order){
        Supplier supplier = orderAssigner.assignedSupplier(order);
        supplier.process(order);

        return new OrderDto(supplier, order);
    }
}
