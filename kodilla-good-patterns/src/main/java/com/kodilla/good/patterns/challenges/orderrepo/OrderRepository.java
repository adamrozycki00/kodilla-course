package com.kodilla.good.patterns.challenges.orderrepo;

import com.kodilla.good.patterns.challenges.model.Product;
import com.kodilla.good.patterns.challenges.model.User;

import java.time.LocalDateTime;

public interface OrderRepository {

    boolean createOrder(User user, Product product, LocalDateTime time);

}
