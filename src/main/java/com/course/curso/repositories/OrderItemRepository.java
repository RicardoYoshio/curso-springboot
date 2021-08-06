package com.course.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
