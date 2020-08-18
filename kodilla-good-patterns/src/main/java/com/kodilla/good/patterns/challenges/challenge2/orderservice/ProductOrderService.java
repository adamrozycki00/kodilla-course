package com.kodilla.good.patterns.challenges.challenge2.orderservice;

import com.kodilla.good.patterns.challenges.challenge2.orderrepo.OrderDto;
import com.kodilla.good.patterns.challenges.challenge2.orderrepo.OrderRepository;
import com.kodilla.good.patterns.challenges.challenge2.orderrequest.OrderRequest;

public class ProductOrderService {

    private final OrderRepository orderRepository;

    public ProductOrderService(final OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isProcessed = orderRequest.getSupplier().process(orderRequest);
        if (isProcessed) {
            orderRepository.createOrder(orderRequest);
            return new OrderDto(orderRequest, true);
        } else {
            return new OrderDto(orderRequest, false);
        }
    }

}
