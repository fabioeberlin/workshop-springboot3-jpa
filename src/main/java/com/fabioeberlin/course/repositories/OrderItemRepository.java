package com.fabioeberlin.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabioeberlin.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
