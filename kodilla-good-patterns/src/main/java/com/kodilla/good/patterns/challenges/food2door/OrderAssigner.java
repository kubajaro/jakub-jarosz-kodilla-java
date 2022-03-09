package com.kodilla.good.patterns.challenges.food2door;

public class OrderAssigner {
    private Supplier extraFoodSupplier = new ExtraFoodShopSupplier("Extra food supplier", 'S' ,1);
    private Supplier glutenFreeShop = new GlutenFreeShopSupplier("Gluten free shop",2, 2);
    private Supplier healthyShop = new HealthyShop("Healthy shop", 3);

    public Supplier assignedSupplier(Order order){
        if(order.getOrderType().equals("ext"))
            return extraFoodSupplier;
        else if(order.getOrderType().equals("glu"))
            return glutenFreeShop;
        else return healthyShop;
    }

}
