package com.example.patterns_banking.repositories.customer;

import com.example.patterns_banking.models.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}
