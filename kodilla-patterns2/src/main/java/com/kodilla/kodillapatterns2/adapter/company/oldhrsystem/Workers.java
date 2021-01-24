package com.kodilla.kodillapatterns2.adapter.company.oldhrsystem;

public class Workers {

    private String[][] workers = {
            {"78010601234", "John", "Smith"},
            {"79083112345", "Ivone", "Novak"},
            {"80040312345", "Jessie", "Pinkman"},
            {"81090801234", "Walter", "White"},
            {"82120712345", "Clara", "Lanson"}
    };

    private double[] salaries = {
            4500.0,
            3700.0,
            4350.0,
            9000.0,
            6200.0
    };

    public String getWorker(int n) {
        if (n > salaries.length)
            return "";
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }

}
