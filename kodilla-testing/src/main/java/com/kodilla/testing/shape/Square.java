package com.kodilla.testing.shape;

public class Square implements Shape {

    private final double side;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;

        Square square = (Square) o;

        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(side);
        return (int) (temp ^ (temp >>> 32));
    }

}
