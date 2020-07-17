package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightMain {

    public static void main(String[] args) {
        Flight flight1 = new Flight("WAW", "CDG");
        Flight flight2 = new Flight("ORY", "RDO");
        Flight flight3 = new Flight("RDO", "ORY");
        List<Flight> flights = List.of(flight1, flight2, flight3);
        FlightMain flightMain = new FlightMain();
        for (Flight flight : flights) {
            try {
                System.out.printf("%s: %s\n", flight, flightMain.findFlight(flight));
            } catch (RouteNotFoundException e) {
                System.out.println(flight + ": " + e.getMessage());
            }
        }
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> map = new HashMap<>();
        map.put("WAW", true);
        map.put("CDG", true);
        map.put("ORY", false);
        if (map.containsKey(flight.getArrivalAirport()))
            return map.get(flight.getArrivalAirport());
        else
            throw new RouteNotFoundException("Destination airport not found");

    }

}

