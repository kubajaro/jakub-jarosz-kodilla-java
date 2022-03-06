package com.kodilla.good.patterns.challenges.onlineShop;

import java.util.List;

public interface OrderService {
    void changeOrderStatus();
    List<Product> createFinalOrderedProductList();
}
