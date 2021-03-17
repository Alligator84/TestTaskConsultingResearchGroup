package com.github.alligator84.testshop.web;

import com.github.alligator84.testshop.app.domain.Customer;
import com.github.alligator84.testshop.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/customers")
public class CustomerApi {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> findAll() {
        return customerService.findAll();
    }
}
