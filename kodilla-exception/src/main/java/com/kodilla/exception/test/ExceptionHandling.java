package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        String result = "no result";
        try {
            result = secondChallenge.probablyIWillThrowException(0, 1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(result);
        }

    }

}
