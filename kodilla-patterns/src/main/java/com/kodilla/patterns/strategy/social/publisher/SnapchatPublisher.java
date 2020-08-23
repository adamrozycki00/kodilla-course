package com.kodilla.patterns.strategy.social.publisher;

public class SnapchatPublisher implements SocialPublisher {

    @Override
    public void share() {
        System.out.println("Posting a picture on Snapchat");
    }

}
