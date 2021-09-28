package com.travel.agency.config;

import com.travel.agency.domain.dto.CustomerDto;
import com.travel.agency.mapper.CustomerMapper;
import com.travel.agency.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AdminConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdminConfig.class);

    public AdminConfig(CustomerService customerService, CustomerMapper customerMapper) {
        CustomerDto customerDto = new CustomerDto("ADMIN","ADMIN","ADMIN@MAIL.COM",
                "123 456 789", "ADMIN", "ADMIN");
        if(!customerService.checkExistsByUsername(customerDto.getUsername())){
            customerService.saveCustomer(customerMapper.mapCustomerDtoToDomain(customerDto));
            LOGGER.info("Create Admin account in the database");
        } else {
            LOGGER.info("Found Admin account in the database");
        }
    }
}
