package com.cursoudemy.course.repositories;

import com.cursoudemy.course.entities.Category;
import com.cursoudemy.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
