package com.github.alligator84.testshop.app.service;

import com.github.alligator84.testshop.app.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    List<Customer> findAll();

    Optional<Customer> findById(Integer id);

    Customer create(Customer customer);
}
