package com.github.alligator84.testshop.app.service;

import com.github.alligator84.testshop.app.dao.CustomerRepository;
import com.github.alligator84.testshop.app.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
