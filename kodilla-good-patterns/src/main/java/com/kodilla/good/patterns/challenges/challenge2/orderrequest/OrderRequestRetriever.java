package com.kodilla.good.patterns.challenges.challenge2.orderrequest;

import com.kodilla.good.patterns.challenges.challenge2.model.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.challenge2.model.Product;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        return new OrderRequest(
                ExtraFoodShop.getInstance(), new Product("game", 100), 100);
    }

}
