package com.kodilla.good.patterns.challenges.food2door;

public class OrderDto {
    private String supplierName;
    private int orderNumber;
    private boolean isOrderRealized;

    public OrderDto(String supplierName, int orderNumber, boolean isOrderRealized) {
        this.supplierName = supplierName;
        this.orderNumber = orderNumber;
        this.isOrderRealized = isOrderRealized;
    }
}
