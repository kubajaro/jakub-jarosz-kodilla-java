package com.kodilla.patterns.builder.bigmac;

public class Sauce {
    private static final String STANDARD = "STANDARD";
    private static final String THOUSAND_ISLAND_DRESSING = "THOUSAND ISLAND DRESSING";
    private static final String BBQ = "BBQ";
    private final String sauce;

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
}
