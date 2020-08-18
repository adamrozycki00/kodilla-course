package com.kodilla.good.patterns.challenges.challenge3.system;

import com.kodilla.good.patterns.challenges.challenge3.model.Flight;
import com.kodilla.good.patterns.challenges.challenge3.model.Location;

import java.util.List;

public interface FlightSystem {

    List<Flight> getAll();

    List<Flight> getFlightsFrom(Location loc);

    List<Flight> getFlightsTo(Location loc);

    List<Flight> getFlightsThrough(Location loc);

}
