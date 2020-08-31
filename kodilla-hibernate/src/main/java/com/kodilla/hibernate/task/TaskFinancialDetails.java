package com.kodilla.hibernate.task;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "task_financials")
public class TaskFinancialDetails {

    private long id;
    private BigDecimal price;
    private boolean paid;

    public TaskFinancialDetails() {
    }

    public TaskFinancialDetails(BigDecimal price, boolean paid) {
        this.price = price;
        this.paid = paid;
    }

    @Id
    @GeneratedValue
    @Column(name = "id", unique = true)
    public long getId() {
        return id;
    }

    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    @Column(name = "paid")
    public boolean isPaid() {
        return paid;
    }

    private void setId(long id) {
        this.id = id;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    private void setPaid(boolean paid) {
        this.paid = paid;
    }

}
