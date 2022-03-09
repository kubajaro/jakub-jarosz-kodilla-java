package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class OrderRequest {

    private List<Product> productList(){
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("product1", 1212));
        productList.add(new Product("product2", 288));
        productList.add(new Product("product3", 11));
        productList.add(new Product("product4", 3));
        productList.add(new Product("product5", 442));

        return productList;
    }

    public Order orderRequest(){
        return new Order("ext", productList(), false);
    }
}
