package com.depgaseagua.depgas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.depgaseagua.depgas.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
