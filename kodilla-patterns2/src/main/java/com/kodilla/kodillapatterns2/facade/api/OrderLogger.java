package com.kodilla.kodillapatterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderLogger {

    private final static Logger LOGGER = LoggerFactory.getLogger(OrderLogger.class);

    @Before("execution(* com.kodilla.kodillapatterns2.facade.api.OrderFacade.processOrder(..))" +
            "&& args(order, userId))")
    public void logEvent(OrderDto order, Long userId) {
        LOGGER.info("Processing order for user id: " + userId);
    }

}
