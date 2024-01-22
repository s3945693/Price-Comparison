package com.five.superprice.repository;
import com.five.superprice.entity.User;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//for sql queries
@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    @Query(value = "SELECT * FROM USER_ACCOUNTS WHERE email = :email AND password = :password", nativeQuery = true)
    Optional<User> findUserByUsernameAndPassword(
            @Param("email") String email,
            @Param("password") String password
    );

    @Query(value = "SELECT * FROM USER_ACCOUNTS WHERE email = :email", nativeQuery = true)
    Optional<User> findUserByEmail(
            @Param("email") String email
    );
}