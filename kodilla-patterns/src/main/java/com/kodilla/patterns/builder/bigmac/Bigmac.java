package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bigmac {
    private final Bread bread;
    private final Burgers burgers;
    private final Sauce sauce;
    private List<Ingredients> ingredients;

    private Bigmac(Bread bread, Burgers burgers, Sauce sauce, List<Ingredients> ingredients) {
        this.bread = bread;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public Bread getBread() {
        return bread;
    }

    public Burgers getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public static class BigmacBuilder {
        private Bread bread = new Bread();
        private Burgers burgers = new Burgers();
        private Sauce sauce = new Sauce();
        private List<Ingredients> ingredientsList = new ArrayList<>();

        public BigmacBuilder Bread(String breadType) {
            bread.setBread(breadType);
            return this;
        }

        public BigmacBuilder Burgers(int burgersNumber) {
            burgers.setBurgers(burgersNumber);
            return this;
        }

        public BigmacBuilder Sauce(String sauceType) {
            sauce.setSauce(sauceType);
            return this;
        }

        public BigmacBuilder ingredientsList(String ingredientType) {
            ingredientsList.add(new Ingredients(ingredientType));
            return this;
        }

        public Bigmac build() throws IllegalStateException {
            return new Bigmac(bread, burgers, sauce, ingredientsList);
        }
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bread=" + bread +
                ", burgers=" + burgers +
                ", sauce=" + sauce +
                ", ingredients=" + ingredients +
                '}';
    }
}
