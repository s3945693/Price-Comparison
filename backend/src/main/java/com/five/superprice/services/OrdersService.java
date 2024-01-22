package com.five.superprice.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.five.superprice.repository.*;
import com.five.superprice.entity.Items;
import com.five.superprice.entity.Order;
import com.five.superprice.entity.OrderProducts;
import com.five.superprice.interfaces.OrderWithItems;
@Service
public class OrdersService {

    OrderRepository orderRepository;
    OrderProductsRepository orderProductsRepository;
    ItemsRepository itemsRepository;
    ProductRepository productRepository;

    TimeslotsRepository timeslotsRepository;
    DeliveryRepository deliveryRepository;

    @Autowired
    public OrdersService(OrderRepository orderRepository, OrderProductsRepository orderProductsRepository, ItemsRepository itemsRepository, ProductRepository productRepository, TimeslotsRepository timeslotsRepository, DeliveryRepository deliveryRepository) {
        this.orderRepository = orderRepository;
        this.orderProductsRepository = orderProductsRepository;
        this.itemsRepository = itemsRepository;
        this.productRepository = productRepository;
        this.timeslotsRepository = timeslotsRepository;
        this.deliveryRepository = deliveryRepository;
    }

    public List<Order> getByUser(Long id){
        return orderRepository.findByUser(id);
    }

    public Order getById(Long id){
        return orderRepository.findById(id).get();
    }

    public List<OrderProducts> getOrderProducts(Long id){
        return orderProductsRepository.findByOrder(id);
    }

    public List<Items> getItems(Long id){
        return itemsRepository.findAllByOrderId(id);
    }

    public OrderWithItems getOrderWithItems(Long id){
        Order order = getById(id);
        List<OrderProducts> orderProducts = getOrderProducts(id);
        return new OrderWithItems(order, orderProducts);
    }

    public void addOrder(OrderWithItems orderWithItems){
        Order order = orderWithItems.getOrder();
        orderRepository.save(order);
        List<OrderProducts> orderProducts = orderWithItems.getOrderProducts();
        
        for(OrderProducts orderProduct: orderProducts){
            orderProduct.setOrder(order);
            orderProductsRepository.save(orderProduct);
        }
    }
    

}
