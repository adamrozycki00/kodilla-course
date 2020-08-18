package com.kodilla.good.patterns.challenges.challenge3;

import com.kodilla.good.patterns.challenges.challenge3.model.Location;
import com.kodilla.good.patterns.challenges.challenge3.system.FSystem1;

public class Application {

    public static void main(String[] args) {
        FSystem1 system = new FSystem1();

        Location gda = new Location("Gdańsk", "GDA");
        Location wwa = new Location("Warszawa", "WWA");
        Location krk = new Location("Kraków", "KRK");

        System.out.println("Flights from Kraków:");
        system.getFlightsFrom(krk).forEach(System.out::println);

        System.out.println("\nFlights to Gdańsk:");
        system.getFlightsTo(gda).forEach(System.out::println);

        System.out.println("\nFlights through Warszawa:");
        system.getFlightsThrough(wwa).forEach(System.out::println);

    }

}
