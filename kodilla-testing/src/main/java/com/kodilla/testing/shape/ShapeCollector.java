package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private final List<Shape> shapes;

    public ShapeCollector() {
        this.shapes = new ArrayList<>();
    }

    public boolean addFigure(Shape shape) {
        return shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapes.remove(shape);
    }

    public Shape getFigure(int index) {
        return shapes.get(index);
    }

    public void showFigures() {
        for (Shape shape : shapes)
            System.out.println(shape.getShapeName());
    }

    public List<Shape> getShapes() {
        return shapes;
    }

}
