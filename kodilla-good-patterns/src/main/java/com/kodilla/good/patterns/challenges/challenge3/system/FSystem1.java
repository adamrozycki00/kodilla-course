package com.kodilla.good.patterns.challenges.challenge3.system;

import com.kodilla.good.patterns.challenges.challenge3.model.Flight;
import com.kodilla.good.patterns.challenges.challenge3.model.Location;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FSystem1 implements FlightSystem {

    private List<Flight> flights;

    public FSystem1() {
        this.flights = new ArrayList<>();
        Location wro = new Location("Wrocław", "WRO");
        Location gda = new Location("Gdańsk", "GDA");
        Location wwa = new Location("Warszawa", "WWA");
        Location szc = new Location("Szczecin", "SZC");
        Location krk = new Location("Kraków", "KRK");

        flights.add(new Flight(1, wro, gda, List.of(wwa)));
        flights.add(new Flight(2, krk, wro, List.of(wwa)));
        flights.add(new Flight(3, krk, gda, new ArrayList<>()));
        flights.add(new Flight(4, wro, wwa, new ArrayList<>()));
        flights.add(new Flight(5, szc, krk, List.of(gda, wwa)));
    }

    public List<Flight> getAll() {
        return flights;
    }

    public List<Flight> getFlightsFrom(Location loc) {
        return flights.stream()
                .filter(flight -> flight.getFrom().equals(loc))
                .collect(Collectors.toList());
    }

    public List<Flight> getFlightsTo(Location loc) {
        return flights.stream()
                .filter(flight -> flight.getTo().equals(loc))
                .collect(Collectors.toList());
    }

    public List<Flight> getFlightsThrough(Location loc) {
        return flights.stream()
                .filter(flight -> flight.getThrough().contains(loc))
                .collect(Collectors.toList());
    }

}
