package com.five.superprice.interfaces;

import java.util.List;

import com.five.superprice.entity.Order;
import com.five.superprice.entity.OrderProducts;

public class OrderWithItems {

    Order order;
    List<OrderProducts> orderProducts;

    public OrderWithItems(Order order, List<OrderProducts> orderProducts) {
        this.order = order;
        this.orderProducts = orderProducts;
    }
    
    public Order getOrder() {
        return order;
    }

    public List<OrderProducts> getOrderProducts() {
        return orderProducts;
    }
}
