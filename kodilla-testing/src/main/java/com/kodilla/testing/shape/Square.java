package com.kodilla.testing.shape;

public class Square implements Shape {

    private final static String shapeName = "Square";
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        double result = Math.pow(side, 2);
        return result;
    }
}
