package com.course.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
