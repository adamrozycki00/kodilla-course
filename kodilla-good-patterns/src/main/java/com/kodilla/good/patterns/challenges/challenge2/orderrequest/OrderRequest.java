package com.kodilla.good.patterns.challenges.challenge2.orderrequest;

import com.kodilla.good.patterns.challenges.challenge2.model.Product;
import com.kodilla.good.patterns.challenges.challenge2.model.Supplier;


public class OrderRequest {

    private final Supplier supplier;
    private final Product product;
    private final double quantity;

    public OrderRequest(final Supplier supplier, final Product product, final double quantity) {
        this.supplier = supplier;
        this.product = product;
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

}
