package com.travel.agency.repository;

import com.travel.agency.domain.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface BookingDao extends CrudRepository<Booking, Long> {

}
