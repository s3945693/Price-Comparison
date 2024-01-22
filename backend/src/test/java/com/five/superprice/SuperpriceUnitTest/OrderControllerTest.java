package com.five.superprice.SuperpriceUnitTest;
import com.five.superprice.controller.OrderController;
import com.five.superprice.entity.*;
import com.five.superprice.services.OrdersService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import com.five.superprice.interfaces.ProductsWithItems;
import com.five.superprice.controller.ProductController;
import com.five.superprice.services.ProductService;

@SpringBootTest
public class OrderControllerTest {

    OrdersService service;
    OrderController controller;

    @BeforeEach
    void setUp() {
        this.service = mock(OrdersService.class);
        controller = new OrderController(this.service);
    }

    @Test

    void getOrderbyId(){
        Order order = new Order();
        when(this.service.getById(1L)).thenReturn(order);
        assertNotNull(this.controller.getOrderDeatils(1L));
    }

}
