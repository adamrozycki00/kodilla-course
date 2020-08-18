package com.kodilla.good.patterns.challenges.challenge2.orderrepo;

import com.kodilla.good.patterns.challenges.challenge2.orderrequest.OrderRequest;

public interface OrderRepository {

    boolean createOrder(OrderRequest orderRequest);

}
