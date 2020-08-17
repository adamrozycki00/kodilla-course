package com.kodilla.good.patterns.challenges.challenge1;

import com.kodilla.good.patterns.challenges.challenge1.infoservice.MailService;
import com.kodilla.good.patterns.challenges.challenge1.orderrequest.OrderRequest;
import com.kodilla.good.patterns.challenges.challenge1.orderrequest.OrderRequestRetriever;
import com.kodilla.good.patterns.challenges.challenge1.orderservice.ProductOrderService;
import com.kodilla.good.patterns.challenges.challenge1.orderrepo.RetailOrderRepository;
import com.kodilla.good.patterns.challenges.challenge1.orderservice.RetailOrderService;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new RetailOrderService(), new RetailOrderRepository());
        productOrderService.process(orderRequest);
    }

}
