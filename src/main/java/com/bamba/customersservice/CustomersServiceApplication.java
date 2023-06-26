package com.bamba.customersservice;

import com.bamba.customersservice.entity.Customer;
import com.bamba.customersservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class CustomersServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomersServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository){

        return args -> {
            customerRepository.save(Customer.builder().name("Khadim").email("seckhadime2@gmail.com").build());
            customerRepository.save(Customer.builder().name("Bamba").email("bamba@gmail.com").build());
            customerRepository.save(Customer.builder().name("cheikh").email("cheikh@gmail.com").build());
        };
    }
}
