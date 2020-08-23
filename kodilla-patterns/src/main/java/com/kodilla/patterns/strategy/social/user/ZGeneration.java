package com.kodilla.patterns.strategy.social.user;

import com.kodilla.patterns.strategy.social.publisher.SnapchatPublisher;

public class ZGeneration extends User {

    public ZGeneration(String name) {
        super(name);
        setPublisher(new SnapchatPublisher());
    }

}
