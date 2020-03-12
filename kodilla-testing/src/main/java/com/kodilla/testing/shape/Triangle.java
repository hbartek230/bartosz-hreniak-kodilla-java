package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private final static String shapeName = "Triangle";
    int side, height;

    public Triangle(int side, int height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        double result = (side * height)/2;
        return result;
    }
}
