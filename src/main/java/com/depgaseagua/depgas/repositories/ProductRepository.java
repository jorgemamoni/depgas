package com.depgaseagua.depgas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.depgaseagua.depgas.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
