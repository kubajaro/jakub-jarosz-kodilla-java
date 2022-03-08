package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetriever {

    private List<Product> orderedProducts(){
        List<Product> orderedProducts = new ArrayList<>();
        orderedProducts.add(new Product("Product 1", 1321235, 100));
        orderedProducts.add(new Product("Product 2", 321, 1));
        orderedProducts.add(new Product("Product 3", 666, 12300));
        orderedProducts.add(new Product("Product 4", 44, 3));
        orderedProducts.add(new Product("Product 5", 213, 1005));

        return orderedProducts;
    }

    public OrderRequest orderRequest(){
        Supplier supplier = new Supplier("Test", 112313);
        Order order = new Order(122, orderedProducts(), false, false);

        return new OrderRequest(supplier, order);
    }
}
