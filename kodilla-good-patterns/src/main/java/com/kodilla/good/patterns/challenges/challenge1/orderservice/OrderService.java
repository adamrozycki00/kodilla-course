package com.kodilla.good.patterns.challenges.challenge1.orderservice;

import com.kodilla.good.patterns.challenges.challenge1.model.Product;
import com.kodilla.good.patterns.challenges.challenge1.model.User;

import java.time.LocalDateTime;

public interface OrderService {

    boolean order(final User user, final Product product, final LocalDateTime time);

}
