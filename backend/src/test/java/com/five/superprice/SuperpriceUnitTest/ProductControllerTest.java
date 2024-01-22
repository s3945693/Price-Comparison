package com.five.superprice.SuperpriceUnitTest;

import com.five.superprice.entity.*;
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
public class ProductControllerTest {
    // made a unit test class
    ProductService service;
    ProductController controller;

    @BeforeEach
    void setUp() {
        this.service = mock(ProductService.class);
        controller = new ProductController(this.service);
    }

    @Test
    void shouldReutrnEmptyCategoryArray(){
        when(this.service.getAllProducts()).thenReturn(new ArrayList<>());
        assertEquals(0, this.controller.getAllCategories().size());
    }

    @Test
    void shouldReturnNotEmptyCategoryArray(){
        ArrayList<Category> toFill = new ArrayList<>();

        Category category = new Category();
        toFill.add(category);
        when(this.service.getAllCategories()).thenReturn(toFill);
        assertEquals(1, this.controller.getAllCategories().size());
    }

    @Test
    void shouldReturnNoProduct(){
        when(this.service.getProductWithItems(1L)).thenReturn(null);
        assertNull(this.controller.getProduct(1L));

    }

    @Test
    void shouldReturnProduct(){
        Products p = new Products();
        List<Items> items = new ArrayList<>();
        ProductsWithItems product = new ProductsWithItems(p, items);
        when(this.service.getProductWithItems(1L)).thenReturn(product);
        assertNotNull(this.controller.getProduct(1L));
    }

    @Test
    void shouldReturnProductGivenCategoryId(){
        Products p = new Products();
        List<Items> items = new ArrayList<>();
        ProductsWithItems product = new ProductsWithItems(p, items);
        List<ProductsWithItems> products = new ArrayList<>();
        products.add(product);
        when(this.service.getProductsByCategory(1L)).thenReturn(products);
        assertEquals(1, this.controller.getProductByCategory(1L).size());
    }

    @Test
    void shouldReturnNoProductGivenCategoryId(){
        when(this.service.getProductsByCategory(1L)).thenReturn(null);
        assertNull(this.controller.getProductByCategory(1L));
    }

    @Test
    void getRating(){
        List<Ratings> rating = new ArrayList<>();
        when(this.service.getProductRating("1")).thenReturn(rating);
        assertNotNull(this.controller.getRating("1"));
    }



    
}
