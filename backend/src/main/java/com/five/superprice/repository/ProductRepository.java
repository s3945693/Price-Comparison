package com.five.superprice.repository;
import com.five.superprice.entity.Products;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Products, Long> {

    @Query (value = "SELECT * FROM PRODUCTS WHERE category_id = :id", nativeQuery = true)
    public List<Products> findAllByCategoryId(@Param("id") Long id);

}
