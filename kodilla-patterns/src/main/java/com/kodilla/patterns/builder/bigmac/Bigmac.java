package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final Bread bread;
    private final int burgers;
    private final Sauce sauce;
    private List<Ingredients> ingredientsList;

    private Bigmac(Bread bread, int burgers, Sauce sauce) {
        this.bread = bread;
        this.burgers = burgers;
        this.sauce = sauce;
        ingredientsList = new ArrayList<>();
    }

    public Bread getBread() {
        return bread;
    }

    public int getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingredients> getIngredientsList() {
        return ingredientsList;
    }

    public static class BigmacBuilder {
        private Bread bread;
        private int burgers;
        private Sauce sauce;
        private List<Ingredients> ingredientsList = new ArrayList<>();

    }
}
