package com.travel.agency.controller;

import com.travel.agency.domain.dto.CustomerDto;
import com.travel.agency.mapper.CustomerMapper;
import com.travel.agency.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;
    private final CustomerMapper customerMapper;

    @PostMapping("/create")
    public void createCustomer(@RequestBody CustomerDto customerDto) {

    }

    @PutMapping("/edit")
    public void editCustomer(@RequestBody CustomerDto customerDto) {

    }

    @DeleteMapping("/delete")
    public void removeCustomer(@RequestParam Long customerId) {

    }

    @GetMapping("/details")
    public CustomerDto getCustomerDetails() {
        return null;
    }

}
