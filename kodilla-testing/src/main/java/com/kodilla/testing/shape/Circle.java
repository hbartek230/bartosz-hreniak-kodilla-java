package com.kodilla.testing.shape;

public class Circle implements Shape {

    private final static String shapeName = "Circle";
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        double result = Math.PI * Math.pow(radius, 2);
        return result;
    }
}
