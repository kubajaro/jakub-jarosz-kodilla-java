package com.kodilla.testing.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{

    private double height;
    private double baseLength;

    public Triangle(double height, double baseLength) {
        this.height = height;
        this.baseLength = baseLength;
    }

    @Override
    public String getShapeName() {
        return "It's a triangle";
    }

    @Override
    public double getArea() {
        return 0.5*height*baseLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.height, height) == 0 && Double.compare(triangle.baseLength, baseLength) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.class.hashCode();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", baseLength=" + baseLength +
                '}';
    }
}
