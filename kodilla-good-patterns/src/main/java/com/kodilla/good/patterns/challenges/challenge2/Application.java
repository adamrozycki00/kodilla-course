package com.kodilla.good.patterns.challenges.challenge2;

import com.kodilla.good.patterns.challenges.challenge2.orderrepo.RetailOrderRepository;
import com.kodilla.good.patterns.challenges.challenge2.orderrequest.OrderRequest;
import com.kodilla.good.patterns.challenges.challenge2.orderrequest.OrderRequestRetriever;
import com.kodilla.good.patterns.challenges.challenge2.orderservice.ProductOrderService;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new RetailOrderRepository());
        productOrderService.process(orderRequest);
    }

}
