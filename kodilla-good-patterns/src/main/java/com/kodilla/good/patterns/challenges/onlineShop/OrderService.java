package com.kodilla.good.patterns.challenges.onlineShop;

import java.util.List;

public interface OrderService {
    boolean checkProductAvailability();
    List<Product> createFinalOrder();
}
