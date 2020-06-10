package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {

        // tests for class Calculator
        Calculator calc = new Calculator();

        int a = 4;
        int b = 7;
        int expected = 11;
        int result = calc.add(a, b);
        if (expected == result) {
            System.out.println("test OK");
        } else {
            System.out.printf("test failed: expected %d, but resulted %d\n", expected, result);
        }

        a = 45;
        b = -7;
        expected = 52;
        result = calc.subtract(a, b);
        if (expected == result) {
            System.out.println("test OK");
        } else {
            System.out.printf("test failed: expected %d, but resulted %d\n", expected, result);
        }

    }

}
