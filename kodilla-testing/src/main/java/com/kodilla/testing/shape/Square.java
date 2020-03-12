package com.kodilla.testing.shape;

public class Square implements Shape {

    int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return this.getClass().toString();
    }

    @Override
    public double getField() {
        double result = Math.pow(a, 2);
        return result;
    }
}
