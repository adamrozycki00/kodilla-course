package com.kodilla.good.patterns.challenges.orderrepo;

import com.kodilla.good.patterns.challenges.model.Product;
import com.kodilla.good.patterns.challenges.model.User;

import java.time.LocalDateTime;

public class RetailOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, Product product, LocalDateTime time) {
        return true;
    }

}
