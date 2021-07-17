package com.course.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
