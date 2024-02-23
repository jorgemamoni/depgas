package com.depgaseagua.depgas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.depgaseagua.depgas.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
