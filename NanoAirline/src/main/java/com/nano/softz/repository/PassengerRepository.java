package com.nano.softz.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.nano.softz.model.Passenger;

import javax.transaction.Transactional;


/**
 * The interface Passenger repository.
 */
@Transactional(Transactional.TxType.REQUIRED)
public interface PassengerRepository extends CrudRepository<Passenger, String> {

    @Query(value = "SELECT DISTINCT * FROM lab2.passenger p, lab2.reservation r WHERE p.id = r.id AND r.order_no = :orderNumber",
            nativeQuery = true)
    Passenger getPassengerByOrderNo(@Param("orderNumber") String orderNumber);

}
