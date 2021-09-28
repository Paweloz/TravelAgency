package com.travel.agency.mapper;

import com.travel.agency.domain.Customer;
import com.travel.agency.domain.dto.CustomerDto;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CustomerMapper {
    private final PasswordEncoder passwordEncoder;

    public CustomerDto mapCustomerToDto(Customer customer) {
        return new CustomerDto(
                customer.getId(),
                customer.getName(),
                customer.getLastname(),
                customer.getEmail(),
                customer.getPhone(),
                customer.getPassword(),
                customer.getRole());
    }

    public Customer mapCustomerDtoToDomain(CustomerDto customerDto) {
        return  new Customer(
                customerDto.getId(),
                customerDto.getName(),
                customerDto.getLastname(),
                customerDto.getEmail(),
                customerDto.getPhone(),
                passwordEncoder.encode(customerDto.getPassword()),
                customerDto.getRole());
    }
}
