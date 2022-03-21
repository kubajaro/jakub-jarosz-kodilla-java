package com.kodilla.patterns.builder.bigmac;

public class Bread {
    public static final String BUN = "BUN";
    public static final String ROLL = "ROLL";
    private String bread;

    public Bread() {
    }

    public Bread(String bread) {
        if (bread.equals(BUN) || bread.equals(ROLL)) {
            this.bread = bread;
        } else {
            throw new IllegalStateException("Bread should be BUN or ROLL!");
        }
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "bread='" + bread + '\'' +
                '}';
    }
}
