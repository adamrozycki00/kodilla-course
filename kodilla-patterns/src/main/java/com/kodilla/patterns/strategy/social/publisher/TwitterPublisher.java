package com.kodilla.patterns.strategy.social.publisher;

public class TwitterPublisher implements SocialPublisher {

    @Override
    public void share() {
        System.out.println("Posting a message on Twitter");
    }

}
