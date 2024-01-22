package com.five.superprice.repository;
import com.five.superprice.entity.OrderProducts;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.repository.query.Param;
@Repository
public interface OrderProductsRepository extends CrudRepository<OrderProducts, Long> {

    @Query (value = "SELECT * FROM ORDER_PRODUCTS WHERE order_id = :id", nativeQuery = true)
    public List<OrderProducts> findByOrder(@Param("id") Long id);


}

