package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final List<Country> countries = new ArrayList<>();

    public Continent() {
        for (int i = 0; i < 100; ++i)
            countries.add(new Country());
    }

    public List<Country> getCountries() {
        return countries;
    }

}
