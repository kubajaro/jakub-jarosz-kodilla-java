package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;

    public OrderProcessor(InformationService informationService, OrderService orderService) {
        this.informationService = informationService;
        this.orderService = orderService;
    }

    public OrderDto process(OrderRequest orderRequest){
        orderService.placeOrder(orderRequest.getOrder());
        informationService.orderPlacedInformation();

        orderService.realizeOrder(orderRequest.getOrder());
        informationService.orderRealizedInformation();

        return new OrderDto(orderRequest.getSupplier().getName(), orderRequest.getOrder().getOrderNumber(),
                orderRequest.getOrder().isOrderRealized());
    }
}
