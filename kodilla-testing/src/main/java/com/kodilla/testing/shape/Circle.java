package com.kodilla.testing.shape;

public class Circle implements Shape {

    int a;

    public Circle(int a) {
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return this.getClass().toString();
    }

    @Override
    public double getField() {
        double result = Math.PI * Math.pow(a, 2);
        return result;
    }
}
