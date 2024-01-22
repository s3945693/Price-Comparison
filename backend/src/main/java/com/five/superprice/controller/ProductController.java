package com.five.superprice.controller;


import com.five.superprice.entity.Category;
import com.five.superprice.entity.Ratings;
import com.five.superprice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.five.superprice.interfaces.ProductsWithItems;

import java.util.List;

@RestController
@RequestMapping("/prds")
@CrossOrigin(origins = "http://localhost:3000")

public class ProductController {

    ProductService service;

    @Autowired
    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/product/{id}")
    public ProductsWithItems getProduct(@PathVariable("id") Long id){
        return service.getProductWithItems(id);
    }

    @GetMapping("/category/{id}")
    public List<ProductsWithItems> getProductByCategory(@PathVariable("id") Long id){
        return service.getProductsByCategory(id);
    }

    @GetMapping("/categories")
    public List<Category> getAllCategories(){
        return service.getAllCategories();
    }

    @PostMapping("/rating/set")
    public ResponseEntity<HttpStatus> setRating(
        @RequestBody Ratings rating,
        @RequestParam("userId") String userId,
        @RequestParam("productId") String productId

    ){
        service.setRating(rating, userId, productId);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/rating/get/{id}")
    public List<Ratings> getRating(@PathVariable("id") String id){
        return service.getProductRating(id);
    }






}
