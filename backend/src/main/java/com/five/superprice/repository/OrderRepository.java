package com.five.superprice.repository;
import com.five.superprice.entity.Order;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

    @Query(value = "SELECT * FROM ORDERS WHERE user_id = :id", nativeQuery = true)
    public List<Order> findByUser(@Param("id") Long id);

}
