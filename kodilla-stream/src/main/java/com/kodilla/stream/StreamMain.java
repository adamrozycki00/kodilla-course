package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier beautifier = new PoemBeautifier();
        String text = "Original string";

        System.out.println(beautifier.beautify(text, String::toUpperCase));
        System.out.println(beautifier.beautify(text, String::toLowerCase));
        System.out.println(beautifier.beautify(text, str -> "ABC " + str + " ABC"));
        System.out.println(beautifier.beautify(text, str -> str.replace(' ', '*')));

    }

}
