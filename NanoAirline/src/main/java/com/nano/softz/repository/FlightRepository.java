package com.nano.softz.repository;

import org.springframework.data.repository.CrudRepository;

import com.nano.softz.model.Flight;

import javax.transaction.Transactional;


/**
 * The interface Flight repository.
 */
@Transactional(Transactional.TxType.REQUIRED)
public interface FlightRepository extends CrudRepository<Flight, String> {
}
