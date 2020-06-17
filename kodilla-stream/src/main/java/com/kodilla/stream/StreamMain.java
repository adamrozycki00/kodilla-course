package com.kodilla.stream;

public class StreamMain {

    public static void main(String[] args) {
        People.getList().stream()
                .forEach(System.out::println);
    }

}
