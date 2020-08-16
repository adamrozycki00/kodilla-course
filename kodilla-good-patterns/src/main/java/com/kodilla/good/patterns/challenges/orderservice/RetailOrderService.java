package com.kodilla.good.patterns.challenges.orderservice;

import com.kodilla.good.patterns.challenges.model.Product;
import com.kodilla.good.patterns.challenges.model.User;

import java.time.LocalDateTime;

public class RetailOrderService implements OrderService {

    @Override
    public boolean order(User user, Product product, LocalDateTime time) {
        System.out.printf("Ordering %s for the user %s %s, timestamp: %s\n",
                product.getName(), user.getFirstName(), user.getLastName(), time);
        return true;
    }

}
