package com.five.superprice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.five.superprice.entity.Order;
import com.five.superprice.interfaces.OrderWithItems;
import com.five.superprice.services.OrdersService;

@RestController
@RequestMapping("/ord")
@CrossOrigin(origins = "http://localhost:3000")

public class OrderController {

    OrdersService service;

    @Autowired
    public OrderController(OrdersService service) {
        this.service = service;
    }

    @GetMapping("/order/{id}")
    public Order getOrderDeatils(@PathVariable("id")Long id){
        return service.getById(id);
    }

    @GetMapping("/order/view/{id}")
    public OrderWithItems getOrderWithItems(@PathVariable("id")Long id){
        return service.getOrderWithItems(id);
    }

    @PostMapping("/order/create")
    public ResponseEntity<HttpStatus> addOrder(@RequestBody OrderWithItems orderWithItems){
        service.addOrder(orderWithItems);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    

    
}
