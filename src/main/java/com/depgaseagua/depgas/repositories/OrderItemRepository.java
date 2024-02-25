package com.depgaseagua.depgas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.depgaseagua.depgas.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
