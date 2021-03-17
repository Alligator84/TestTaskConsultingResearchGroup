package com.github.alligator84.testshop.app.dao;

import com.github.alligator84.testshop.app.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
