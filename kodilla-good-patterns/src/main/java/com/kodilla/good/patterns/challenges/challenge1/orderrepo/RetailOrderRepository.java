package com.kodilla.good.patterns.challenges.challenge1.orderrepo;

import com.kodilla.good.patterns.challenges.challenge1.model.Product;
import com.kodilla.good.patterns.challenges.challenge1.model.User;

import java.time.LocalDateTime;

public class RetailOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, Product product, LocalDateTime time) {
        return true;
    }

}
