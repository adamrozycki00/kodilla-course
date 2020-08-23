package com.kodilla.patterns.strategy.social.user;

import com.kodilla.patterns.strategy.social.publisher.FacebookPublisher;

public class Millenial extends User {

    public Millenial(String name) {
        super(name);
        setPublisher(new FacebookPublisher());
    }

}
