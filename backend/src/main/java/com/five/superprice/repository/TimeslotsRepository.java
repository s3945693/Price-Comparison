package com.five.superprice.repository;
import com.five.superprice.entity.Timeslots;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TimeslotsRepository extends CrudRepository<Timeslots, Long> {
}
