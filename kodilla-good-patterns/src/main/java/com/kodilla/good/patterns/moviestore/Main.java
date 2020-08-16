package com.kodilla.good.patterns.moviestore;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        new MovieStore().getMovies().values().stream()
                .flatMap(Collection::stream)
                .map(title -> title + "! ")
                .forEach(System.out::print);
    }

}
