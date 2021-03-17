package com.github.alligator84.testshop.app.dao;

import com.github.alligator84.testshop.app.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
