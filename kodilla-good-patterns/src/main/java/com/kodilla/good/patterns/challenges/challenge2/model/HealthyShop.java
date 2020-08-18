package com.kodilla.good.patterns.challenges.challenge2.model;

import com.kodilla.good.patterns.challenges.challenge2.orderrequest.OrderRequest;

public class HealthyShop extends Supplier {

    private static HealthyShop INSTANCE;

    private final String apiAddress = "healthyshop.com/order";

    private HealthyShop() {
        super("Healthy Shop");
    }

    public static HealthyShop getInstance() {
        if (INSTANCE == null)
            INSTANCE = new HealthyShop();
        return INSTANCE;
    }

    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.printf("Ordering through the supplier's API at %s\n", apiAddress);
        return true;
    }

}
