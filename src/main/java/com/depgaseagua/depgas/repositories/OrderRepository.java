package com.depgaseagua.depgas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.depgaseagua.depgas.entities.Order;
import com.depgaseagua.depgas.entities.User;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
