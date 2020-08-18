package com.kodilla.good.patterns.challenges.challenge3.model;

import java.util.List;

public class Flight {

    private final int id;
    private final Location from;
    private final Location to;
    private final List<Location> through;

    public Flight(int id, Location from, Location to, List<Location> through) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.through = through;
    }

    public int getId() {
        return id;
    }

    public Location getFrom() {
        return from;
    }

    public Location getTo() {
        return to;
    }

    public List<Location> getThrough() {
        return through;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", from=" + from +
                ", to=" + to +
                ", through=" + through +
                '}';
    }

}
