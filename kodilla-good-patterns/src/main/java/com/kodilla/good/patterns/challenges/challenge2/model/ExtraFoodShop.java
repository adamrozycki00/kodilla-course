package com.kodilla.good.patterns.challenges.challenge2.model;

import com.kodilla.good.patterns.challenges.challenge2.orderrequest.OrderRequest;

public class ExtraFoodShop extends Supplier {

    private static ExtraFoodShop INSTANCE;

    private ExtraFoodShop() {
        super("Extra Food Shop");
    }

    public static ExtraFoodShop getInstance() {
        if (INSTANCE == null)
            INSTANCE = new ExtraFoodShop();
        return INSTANCE;
    }

    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("Reaching out to the shop");
        System.out.println("Confirming order");
        return true;
    }

}
