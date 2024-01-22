package com.five.superprice.repository;
import com.five.superprice.entity.Notifications;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface NotificationRepository extends CrudRepository<Notifications, Long>{

    //find notification by user id
    @Query (value = "SELECT * FROM NOTIFICATIONS WHERE user_id = :userId", nativeQuery = true)
    List<Notifications> findNotificationsByUserId(
            @Param("userId") String userId
    );

    
}
