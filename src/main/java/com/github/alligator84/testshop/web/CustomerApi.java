package com.github.alligator84.testshop.web;

import com.github.alligator84.testshop.app.domain.Customer;
import com.github.alligator84.testshop.app.service.CustomerService;
import com.github.alligator84.testshop.web.dto.CustomerDto;
import com.github.alligator84.testshop.web.dto.ErrorDto;
import com.github.alligator84.testshop.web.dto.IdDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/api/customers")
public class CustomerApi {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<CustomerDto> findAll() {
        return customerService.findAll().stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping(path = "/{id}")
    public CustomerDto findById(@PathVariable Integer id) {
        return customerService.findById(id)
                .map(customer -> toDto(customer))
                .orElseThrow(() -> new RuntimeException("Not found customer by id"));
    }

    @PostMapping
    public IdDto create(@RequestBody CustomerDto request) {
        Customer customer = new Customer();
        customer.setName(request.getName());
        customer.setInn(request.getInn());

        IdDto dto = new IdDto();
        dto.setId(customerService.create(customer).getId());
        return dto;
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorDto handle(RuntimeException e) {
        ErrorDto dto = new ErrorDto();
        dto.setMessage(e.getMessage());
        return dto;
    }

    private CustomerDto toDto(Customer customer) {
        CustomerDto dto = new CustomerDto();
        dto.setId(customer.getId());
        dto.setName(customer.getName());
        dto.setInn(customer.getInn());

        return dto;
    }
}
