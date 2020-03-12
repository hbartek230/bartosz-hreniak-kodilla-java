package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public ArrayList<Shape> addFigure(Shape shape) {
        shapes.add(shape);
        return shapes;
    }

    public boolean removeFigure(Shape shape) {
        return shape != null && shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        if (n < shapes.size() && n >= 0) {
            return shapes.get(n);
        } else {
            return null;
        }
    }

    public ArrayList<Shape> showFigures() {
        System.out.println("This are shapes: " + shapes);
        return shapes;
    }
}
