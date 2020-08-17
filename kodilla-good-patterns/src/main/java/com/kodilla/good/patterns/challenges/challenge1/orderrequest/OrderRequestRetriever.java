package com.kodilla.good.patterns.challenges.challenge1.orderrequest;

import com.kodilla.good.patterns.challenges.challenge1.model.Product;
import com.kodilla.good.patterns.challenges.challenge1.model.User;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Miles", "Davis");
        Product product = new Product("game", 100);
        LocalDateTime time = LocalDateTime.of(2020,8,1,12,0);
        return new OrderRequest(user, product, time);
    }

}
