package com.kodilla.spring.intro.shape;

public class Drawer {
    Shape shape;

    public Drawer() {
    }

    public Drawer(final Shape shape) {
        this.shape = shape;
    }

    public void doDrawing() {
        Figure figure;

        figure = new Circle();
        figure.draw();

        figure = new Triangle();
        figure.draw();
    }

    public String doShapeDrawing() {
      return shape.drawShape();
    }
}
