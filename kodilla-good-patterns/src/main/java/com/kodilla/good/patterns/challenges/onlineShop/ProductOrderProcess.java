package com.kodilla.good.patterns.challenges.onlineShop;

public class ProductOrderProcess {
    private InformationService informationService;
    private OrderService orderService;

    public ProductOrderProcess(InformationService informationService, OrderService orderService) {
        this.informationService = informationService;
        this.orderService = orderService;
    }

    public OrderDto process(final OrderRequest orderRequest){
        informationService.informIfProductUnavailable();
        Order updatedOrder = orderRequest.getOrder();
        updatedOrder.setOrderedProducts(orderService.createFinalOrderedProductList());
        orderService.changeOrderStatus();

        OrderRequest updatedOrderRequest = orderRequest;
        updatedOrderRequest.setOrder(updatedOrder);

        System.out.println("Order status changed");
        return new OrderDto(updatedOrderRequest.getCustomer().getName(), updatedOrderRequest.getCustomer().getLastname(),
                updatedOrderRequest.getOrder().getOrderNumber(), updatedOrderRequest.getOrder().getOrderedProducts());
    }
}
