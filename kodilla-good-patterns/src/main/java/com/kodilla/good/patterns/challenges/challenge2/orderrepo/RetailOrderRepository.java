package com.kodilla.good.patterns.challenges.challenge2.orderrepo;

import com.kodilla.good.patterns.challenges.challenge2.orderrequest.OrderRequest;

public class RetailOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(OrderRequest orderRequest) {
        return true;
    }

}
