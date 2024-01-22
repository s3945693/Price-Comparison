package com.five.superprice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "notifications")
public class Notifications {

    

   

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products product;

    @Column(name = "price")
    private double price;

    //getters and setters
    public long getId() {
        return id;
    }

    

    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }

    public Products getProduct(){
        return product;
    }

    public void setProduct(Products product){
        this.product = product;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    
}
