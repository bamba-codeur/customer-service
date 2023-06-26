package com.bamba.customersservice.web;


import com.bamba.customersservice.entity.Customer;
import com.bamba.customersservice.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@AllArgsConstructor
@Controller
public class CustomerGraphQLController {

    private CustomerRepository customerRepository;

    @QueryMapping
    List<Customer> allCustomers(){
        return customerRepository.findAll();
    }
}
