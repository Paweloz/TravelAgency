package com.travel.agency.service;

import com.travel.agency.domain.Customer;
import com.travel.agency.domain.dto.CustomerDto;
import com.travel.agency.repository.CustomerDao;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService implements UserDetailsService {

    private final CustomerDao customerDao;

    public Customer saveCustomer(Customer customer) {
        return customerDao.save(customer);
    }

    public boolean checkExistsByUsername(String name) {
        return customerDao.existsByName(name);
    }

    @Override
    public Customer loadUserByUsername(String username) throws UsernameNotFoundException {
        return customerDao.findCustomerByName(username);
    }


}
