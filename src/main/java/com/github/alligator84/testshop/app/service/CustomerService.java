package com.github.alligator84.testshop.app.service;

import com.github.alligator84.testshop.app.domain.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();
}
