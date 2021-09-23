package com.travel.agency.repository;

import com.travel.agency.domain.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface PaymentDao extends CrudRepository<Payment, Long> {
}
