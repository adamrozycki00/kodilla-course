package com.kodilla.good.patterns.challenges.challenge2.model;

import com.kodilla.good.patterns.challenges.challenge2.orderrequest.OrderRequest;

abstract public class Supplier {

    protected final String name;
    protected String address;

    public Supplier(String name) {
        this.name = name;
    }

    abstract public boolean process(OrderRequest orderRequest);

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
