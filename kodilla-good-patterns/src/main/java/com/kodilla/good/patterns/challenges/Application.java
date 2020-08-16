package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.infoservice.MailService;
import com.kodilla.good.patterns.challenges.orderrequest.OrderRequest;
import com.kodilla.good.patterns.challenges.orderrequest.OrderRequestRetriever;
import com.kodilla.good.patterns.challenges.orderservice.ProductOrderService;
import com.kodilla.good.patterns.challenges.orderrepo.RetailOrderRepository;
import com.kodilla.good.patterns.challenges.orderservice.RetailOrderService;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new RetailOrderService(), new RetailOrderRepository());
        productOrderService.process(orderRequest);
    }

}
