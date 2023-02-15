package com.fabioeberlin.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabioeberlin.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
