package com.five.superprice.repository;

import com.five.superprice.entity.Items;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface ItemsRepository extends CrudRepository<Items, Long>{

    @Query(value = "SELECT * FROM ITEMS WHERE product_id = :id", nativeQuery = true)
    public List<Items> findAllByProductId(@Param("id") Long id);

    //query join with OrderProduct
    @Query(value = "SELECT i.* FROM items i JOIN order_products op ON i.id = op.item_id WHERE op.order_id = :orderId;", nativeQuery = true)
    public List<Items> findAllByOrderId(@Param("orderId") Long orderId);

}
