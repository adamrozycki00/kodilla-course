package com.kodilla.good.patterns.challenges.orderservice;

import com.kodilla.good.patterns.challenges.model.Product;
import com.kodilla.good.patterns.challenges.model.User;

import java.time.LocalDateTime;

public interface OrderService {

    boolean order(final User user, final Product product, final LocalDateTime time);

}
