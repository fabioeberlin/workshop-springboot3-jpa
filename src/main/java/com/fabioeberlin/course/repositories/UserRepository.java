package com.fabioeberlin.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabioeberlin.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
