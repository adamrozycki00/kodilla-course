package com.kodilla.good.patterns.challenges.challenge1.orderservice;

import com.kodilla.good.patterns.challenges.challenge1.orderrepo.OrderDto;
import com.kodilla.good.patterns.challenges.challenge1.orderrepo.OrderRepository;
import com.kodilla.good.patterns.challenges.challenge1.orderrequest.OrderRequest;
import com.kodilla.good.patterns.challenges.challenge1.infoservice.InformationService;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getTime());
        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getTime());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }

}
