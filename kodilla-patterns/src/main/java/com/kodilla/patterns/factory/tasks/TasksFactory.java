package com.kodilla.patterns.factory.tasks;

public class TasksFactory {
    public static final String DRIVING_TASK = "DRIVING TASK";
    public static final String PAINTING_TASK = "PAINTING TASK";
    public static final String SHOPPING_TASK = "SHOPPING TASK";

    public final Tasks createTask(final String task) {
        switch (task) {
            case DRIVING_TASK:
                return new DrivingTask("Driving task", "Home", "Car");
            case PAINTING_TASK:
                return new PaintingTask("Painting task", "Red", "Door");
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping task", "Onion", 2.50);
            default:
                return null;
        }
    }
}
