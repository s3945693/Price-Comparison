package com.five.superprice.repository;
import com.five.superprice.entity.Ratings;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface RatingsRepository extends CrudRepository<Ratings, Long> {

    @Query (value = "SELECT * FROM RATINGS WHERE product_id = :productId", nativeQuery = true)
    List<Ratings> findRatingsByProductId(
            @Param("productId") String productId
    );
}
