package com.five.superprice.services;

import com.five.superprice.entity.Category;
import com.five.superprice.entity.Items;
import com.five.superprice.entity.Products;
import com.five.superprice.entity.Ratings;
import com.five.superprice.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.five.superprice.interfaces.ProductsWithItems;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    ProductRepository productRepository;
    ItemsRepository itemsRepository;
    RatingsRepository ratingsRepository;
    CategoryRepository categoryRepository;
    SupermarketsRepository supermarketsRepository;


    @Autowired
    public ProductService(ProductRepository productRepository, ItemsRepository itemsRepository, RatingsRepository ratingsRepository, CategoryRepository categoryRepository, SupermarketsRepository supermarketsRepository) {
        this.productRepository = productRepository;
        this.itemsRepository = itemsRepository;
        this.ratingsRepository = ratingsRepository;
        this.categoryRepository = categoryRepository;
        this.supermarketsRepository = supermarketsRepository;
    }

    public Iterable<Products> getAllProducts() {
        return productRepository.findAll();
    }

    public Products getProduct(Long id) {
        return productRepository.findById(id).orElseThrow();
    }

    public ProductsWithItems getProductWithItems(Long id) {
        Products product = productRepository.findById(id).orElseThrow();
        List<Items> items = itemsRepository.findAllByProductId(id);
        ProductsWithItems productsWithItems = new ProductsWithItems(product, items);
        return productsWithItems;
    }

    public List<ProductsWithItems> getProductsByCategory(Long id) {
        List<Products> products = productRepository.findAllByCategoryId(id);
        List<ProductsWithItems> productsWithItems = new ArrayList<>();;
        for (Products product : products) {
            List<Items> items = itemsRepository.findAllByProductId(product.getId());
            productsWithItems.add(new ProductsWithItems(product, items));
        }
        return productsWithItems;
    }

    public List<Category> getAllCategories() {
        return (List<Category>) categoryRepository.findAll();
    }

    public void setRating(Ratings rating, String userId, String productId) {
        ratingsRepository.save(rating);
        
    }

    public List<Ratings> getProductRating(String productId) {
        return ratingsRepository.findRatingsByProductId(productId);
    }





}
