package com.github.alligator84.testshop;

import com.github.alligator84.testshop.app.dao.CustomerRepository;
import com.github.alligator84.testshop.app.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class TestShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestShopApplication.class, args);
    }

}

@Component
class Test {

    @Autowired
    private CustomerRepository customerRepository;

    @PostConstruct
    public void test() {
        customerRepository.save(new Customer());
        System.out.println("customerRepository.findAll() = " + customerRepository.findAll());
    }
}
