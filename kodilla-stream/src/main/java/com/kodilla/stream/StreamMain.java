package com.kodilla.stream;

public class StreamMain {

    public static void main(String[] args) {
        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.startsWith("M"))
                .forEach(System.out::println);
    }

}
