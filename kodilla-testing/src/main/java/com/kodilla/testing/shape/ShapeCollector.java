package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public boolean addFigure(Shape shape) {
        boolean added = false;
        if (shape != null) {
            if(shapes.add(shape)) {
                added = true;
            }
        }
        return added;
    }

    public boolean removeFigure(Shape shape) {
        boolean removed = false;
        if (shape != null) {
            if (shapes.remove(shape)) {
                removed = true;
            }
        }
        return removed;
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
