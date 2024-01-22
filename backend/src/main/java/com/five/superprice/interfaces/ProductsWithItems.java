package com.five.superprice.interfaces;

import com.five.superprice.entity.Items;
import com.five.superprice.entity.Products;

import java.util.List;

public class ProductsWithItems {

    Products product = null;
    List<Items> items = null;

    public ProductsWithItems(Products product, List<Items> items) {
        this.product = product;
        this.items = items;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public void insertItem(Items item) {
        this.items.add(item);
    }


}
