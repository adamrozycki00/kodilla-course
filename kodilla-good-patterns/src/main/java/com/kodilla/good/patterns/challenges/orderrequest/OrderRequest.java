package com.kodilla.good.patterns.challenges.orderrequest;

import com.kodilla.good.patterns.challenges.model.Product;
import com.kodilla.good.patterns.challenges.model.User;

import java.time.LocalDateTime;

public class OrderRequest {

    private final User user;
    private final Product product;
    private final LocalDateTime time;

    public OrderRequest(final User user, final Product product, final LocalDateTime time) {
        this.user = user;
        this.product = product;
        this.time = time;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getTime() {
        return time;
    }

}
