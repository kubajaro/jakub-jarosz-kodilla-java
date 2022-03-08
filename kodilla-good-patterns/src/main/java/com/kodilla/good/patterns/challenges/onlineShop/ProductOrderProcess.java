package com.kodilla.good.patterns.challenges.onlineShop;

public class ProductOrderProcess {
    private InformationService informationService;
    private OrderService orderService;

    public ProductOrderProcess(InformationService informationService, OrderService orderService) {
        this.informationService = informationService;
        this.orderService = orderService;
    }

    public OrderDto process(final OrderRequest orderRequest){
        orderService.changeOrderStatus(orderRequest.getOrder());
        informationService.sendOrderStatusNotification();

        System.out.println("Order status changed");
        return new OrderDto(orderRequest.getCustomer().getName(), orderRequest.getCustomer().getLastname(),
                orderRequest.getOrder().getOrderNumber(), orderRequest.getOrder().getOrderedProducts());
    }
}
