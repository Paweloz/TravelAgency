package com.travel.agency.controller;

import com.travel.agency.domain.dto.CustomerDto;
import com.travel.agency.mapper.CustomerMapper;
import com.travel.agency.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/customer")
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;
    private final CustomerMapper customerMapper;

    @PostMapping()
    public void createCustomer(@RequestBody CustomerDto customerDto) {
       customerService.saveCustomer(customerMapper.mapCustomerDtoToDomain(customerDto));

    }

    @PutMapping("/edit")
    public void editCustomer(@RequestBody CustomerDto customerDto) {

    }

    @DeleteMapping("/delete")
    public void removeCustomer(@RequestParam Long customerId) {

    }

    @GetMapping()
    public CustomerDto getCustomerByName(@RequestParam String name) {
        return customerMapper.mapCustomerToDto(customerService.loadUserByUsername(name));
    }

    @GetMapping("/exist")
    public boolean checkIfExistInDb(@RequestParam String name) {
        return customerService.checkExistsByUsername(name);
    }

    @GetMapping("/tmp")
    public void getCustomerDetails() {
        System.out.println("Działa");
    }

}
