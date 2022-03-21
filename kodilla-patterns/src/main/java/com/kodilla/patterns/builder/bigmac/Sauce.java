package com.kodilla.patterns.builder.bigmac;

public class Sauce {
    public static final String STANDARD = "STANDARD";
    public static final String THOUSAND_ISLAND_DRESSING = "THOUSAND ISLAND DRESSING";
    public static final String BBQ = "BBQ";
    private String sauce;

    public Sauce() {
    }

    public Sauce(String sauce) {
        if (sauce.equals(STANDARD) || sauce.equals(THOUSAND_ISLAND_DRESSING) || sauce.equals(BBQ)) {
            this.sauce = sauce;
        } else {
            throw new IllegalStateException("Sauce should be type STANDARD, THOUSAND ISLAND SAUCE or BBQ");
        }
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        return "Sauce{" +
                "sauce='" + sauce + '\'' +
                '}';
    }
}
