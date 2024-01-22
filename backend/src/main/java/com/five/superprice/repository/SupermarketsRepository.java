package com.five.superprice.repository;
import com.five.superprice.entity.Supermarkets;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SupermarketsRepository extends CrudRepository<Supermarkets, Long>{

}
