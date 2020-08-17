package com.kodilla.good.patterns.challenges.challenge1.orderrepo;

import com.kodilla.good.patterns.challenges.challenge1.model.Product;
import com.kodilla.good.patterns.challenges.challenge1.model.User;

import java.time.LocalDateTime;

public interface OrderRepository {

    boolean createOrder(User user, Product product, LocalDateTime time);

}
