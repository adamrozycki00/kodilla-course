package com.kodilla.testing.shape;

public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square() {
        this(1);
    }

    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public double getField() {
        return side * side;
    }

}
