package com.five.superprice.repository;
import com.five.superprice.entity.Delivery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends CrudRepository<Delivery, Long> {
}
