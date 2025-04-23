package com.example.patterns_banking.controllers.customer;

import com.example.patterns_banking.dtos.customer.CustomerDTO;
import com.example.patterns_banking.models.customer.Customer;
import com.example.patterns_banking.services.customer.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
  private final CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @PostMapping
  public ResponseEntity<Customer> createCustomer(@RequestBody CustomerDTO customerDTO) {
    return ResponseEntity.ok(customerService.create(customerDTO));
  }
}
