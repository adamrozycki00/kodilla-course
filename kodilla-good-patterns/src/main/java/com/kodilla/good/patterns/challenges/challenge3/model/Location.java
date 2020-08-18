package com.kodilla.good.patterns.challenges.challenge3.model;

public class Location {

    private final String name;
    private final String code;

    public Location(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;

        Location location = (Location) o;

        if (!name.equals(location.name)) return false;
        return code.equals(location.code);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + code.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return name + '(' + code + ')';
    }

}
