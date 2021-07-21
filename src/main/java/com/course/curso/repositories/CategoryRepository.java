package com.course.curso.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.curso.entities.Category;
import com.course.curso.entities.User;

public interface CategoryRepository extends JpaRepository<Category, Long>{


}
