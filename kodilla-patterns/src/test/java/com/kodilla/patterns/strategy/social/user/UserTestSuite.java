package com.kodilla.patterns.strategy.social.user;

import com.kodilla.patterns.strategy.social.publisher.TwitterPublisher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertEquals;

public class UserTestSuite {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testDefaultSharingStrategies() {
        //given
        User millennial = new Millenial("user1");
        User yGeneration = new YGeneration("user2");
        User zGeneration = new ZGeneration("user3");

        //when
        millennial.sharePost();
        yGeneration.sharePost();
        zGeneration.sharePost();

        //then
        String output =
                "Posting a message on Facebook" + "\r\n" +
                        "Posting a message on Twitter" + "\r\n" +
                        "Posting a picture on Snapchat" + "\r\n";
        assertEquals(output, log.getLog());
    }

    @Test
    public void testIndividualSharingStrategies() {
        //given
        User millennial = new Millenial("user1");

        //when
        millennial.sharePost();
        millennial.setPublisher(new TwitterPublisher());
        millennial.sharePost();

        //then
        String output =
                "Posting a message on Facebook" + "\r\n" +
                        "Posting a message on Twitter" + "\r\n";
        assertEquals(output, log.getLog());
    }

}
