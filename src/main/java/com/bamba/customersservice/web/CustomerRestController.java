package com.bamba.customersservice.web;

import com.bamba.customersservice.entity.Customer;
import com.bamba.customersservice.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CustomerRestController {

    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    List<Customer> getCustomer(){
        return  customerRepository.findAll();
    }


    @GetMapping("/customer/{id}")
    Customer getCustomerById(@PathVariable Long id){
        return customerRepository.findById(id).get();
    }

    @PostMapping("/customers")
    Customer saveCustomer(Customer customer){
        customerRepository.save(customer);
        return customer;
    }

}

