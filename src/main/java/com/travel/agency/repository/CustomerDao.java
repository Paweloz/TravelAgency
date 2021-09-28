package com.travel.agency.repository;

import com.travel.agency.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends CrudRepository<Customer, Long> {

    Customer findCustomerByName(String name);
    boolean existsByName(String name);
}
