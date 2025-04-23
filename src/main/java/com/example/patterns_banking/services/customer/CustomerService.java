package com.example.patterns_banking.services.customer;

import com.example.patterns_banking.dtos.customer.CustomerDTO;
import com.example.patterns_banking.models.customer.Customer;
import com.example.patterns_banking.repositories.customer.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
  private CustomerRepository customerRepository;

  public CustomerService() {
    this.customerRepository = CustomerRepository.getInstance();
  }

  public Customer create(CustomerDTO customerDTO) {
    Customer customer = Customer
      .builder()
      .name(customerDTO.getName())
      .email(customerDTO.getEmail())
      .build();

    return customerRepository.save(customer);
  }
}
