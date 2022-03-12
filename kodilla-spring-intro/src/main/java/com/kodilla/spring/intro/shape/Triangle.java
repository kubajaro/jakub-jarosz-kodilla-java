package com.kodilla.spring.intro.shape;

public class Triangle extends Figure implements Shape {

    @Override
    public void draw() {
        System.out.println("This is a triangle");
    }


    @Override
    public String drawShape() {
        System.out.println("This is a triangle");
        return "This is a triangle";
    }
}
