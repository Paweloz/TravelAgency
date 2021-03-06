package com.travel.agency.repository;
import com.travel.agency.domain.Hotel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface HotelDao extends CrudRepository<Hotel, Long> {
    Boolean existsByLocation(String location);
    Hotel findByLocation(String location);
    Hotel findByHotelId(String hotelId);
}
