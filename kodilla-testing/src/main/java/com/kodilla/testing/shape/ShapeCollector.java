package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private final List<Shape> shapes;

    public ShapeCollector(List<Shape> shapes) {
        this.shapes = new ArrayList<>();
    }

    public boolean add(Shape shape) {
        return shapes.add(shape);
    }

    public boolean remove(Shape shape) {
        return shapes.remove(shape);
    }

    public Shape get(int index) {
        return shapes.get(index);
    }

}
