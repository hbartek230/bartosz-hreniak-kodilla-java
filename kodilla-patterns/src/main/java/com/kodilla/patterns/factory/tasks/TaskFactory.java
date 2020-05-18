package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskName) {
        switch (taskName) {
            case SHOPPING:
                return new ShoppingTask("Shopping", "shoes", 2);
            case PAINTING:
                return new PaintingTask("Painting", "blue", "wall");
            case DRIVING:
                return new DrivingTask("Driving", "shop", "bicycle");
            default:
                return null;
        }
    }
}
