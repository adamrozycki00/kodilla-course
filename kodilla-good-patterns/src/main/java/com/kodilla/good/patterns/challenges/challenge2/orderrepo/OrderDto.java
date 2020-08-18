package com.kodilla.good.patterns.challenges.challenge2.orderrepo;

import com.kodilla.good.patterns.challenges.challenge2.orderrequest.OrderRequest;

public class OrderDto {

    private final OrderRequest orderRequest;
    private final boolean isOrdered;

    public OrderDto(final OrderRequest orderRequest, final boolean isOrdered) {
        this.orderRequest = orderRequest;
        this.isOrdered = isOrdered;
    }

    public OrderRequest getOrderRequest() {
        return orderRequest;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

}
