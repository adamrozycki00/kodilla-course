package com.kodilla.testing.shape;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeCollectorTest {

    @Test
    public void shouldAddFigureToTheList() {
        //given
        ShapeCollector collector = new ShapeCollector();

        //when
        boolean result = collector.addFigure(new Circle());

        //then
        assertTrue(result);
        assertEquals(1, collector.getShapes().size());
    }

    @Test
    public void shouldRemoveFigureFromTheList() {
        //given
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(new Circle());
        collector.addFigure(new Square());
        collector.addFigure(new Square(4));

        //when
        boolean result = collector.removeFigure(new Square());

        //then
        assertTrue(result);
        assertEquals(2, collector.getShapes().size());
    }

    @Test
    public void shouldGetFigureAccordingToIndex() {
        //given
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(new Circle());
        collector.addFigure(new Square());
        collector.addFigure(new Square(4));

        //when
        Shape result = collector.getFigure(1);

        //then
        assertEquals(result, new Square());
    }

}
