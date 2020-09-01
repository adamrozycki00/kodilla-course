package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {

    private int id;
    private String name;
    private List<Item> items;

    public Product(String name) {
        this.name = name;
    }

    public Product() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    @NotNull
    public String getName() {
        return name;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY

    )
    public List<Item> getItems() {
        return items;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
