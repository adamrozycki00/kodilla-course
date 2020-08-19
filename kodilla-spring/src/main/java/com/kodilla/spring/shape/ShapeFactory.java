package com.kodilla.spring.shape;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class ShapeFactory {

    @Bean
    public Square createSquare() {
        return new Square();
    }

    @Bean
    public Shape chosenShape() {
        Shape shape;
        int chosen = new Random().nextInt(3);
        switch (chosen) {
            case 0:
                shape = new Triangle();
                break;
            case 1:
                shape = new Circle();
                break;
            default:
                shape = new Square();
                break;
        }
        return shape;
    }

}
