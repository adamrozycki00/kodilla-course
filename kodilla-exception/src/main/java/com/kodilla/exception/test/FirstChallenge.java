package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {
        double result = 0;
        FirstChallenge firstChallenge = new FirstChallenge();
        try {
            result = firstChallenge.divide(3, 0);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
        } finally {
            System.out.println(result);
        }
    }

}
