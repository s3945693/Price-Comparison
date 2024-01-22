package com.five.superprice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "items")
public class Items {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products product;

    @Column(name = "price")
    private double price;

    @ManyToOne
    @JoinColumn(name = "supermarket_id")
    private Supermarkets superMarket;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Supermarkets getSuperMarket() {
        return superMarket;
    }

    public void setSuperMarket(Supermarkets superMarket) {
        this.superMarket = superMarket;
    }
}
