package com.kodilla.patterns.strategy.social.user;

import com.kodilla.patterns.strategy.social.publisher.SocialPublisher;

public class User {

    final private String name;
    private SocialPublisher publisher;

    public User(String name) {
        this.name = name;
    }

    public void sharePost() {
        publisher.share();
    }

    public String getName() {
        return name;
    }

    public SocialPublisher getPublisher() {
        return publisher;
    }

    public void setPublisher(SocialPublisher publisher) {
        this.publisher = publisher;
    }

}
