package com.kodilla.patterns.factory.tasks;

final public class TaskFactory {

    final public static String SHOPPING = "SHOPPING";
    final public static String DRIVING = "DRIVING";
    final public static String PAINTING = "PAINTING";

    final public Task createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("shoppingTask", "apples", 2);
            case DRIVING:
                return new DrivingTask("drivingTask", "school", "bicycle");
            case PAINTING:
                return new PaintingTask("paintingTask", "orange", "door");
            default:
                return null;
        }
    }

}
