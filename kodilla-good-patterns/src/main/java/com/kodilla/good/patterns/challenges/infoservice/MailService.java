package com.kodilla.good.patterns.challenges.infoservice;

import com.kodilla.good.patterns.challenges.model.User;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.printf("Sending email to %s %s\n", user.getFirstName(), user.getLastName());
    }

}
