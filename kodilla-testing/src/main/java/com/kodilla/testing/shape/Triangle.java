package com.kodilla.testing.shape;

public class Triangle implements Shape {

    int a, h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double getField() {
        double result = (a*h)/2;
        return result;
    }
}
