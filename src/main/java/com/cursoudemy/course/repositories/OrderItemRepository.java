package com.cursoudemy.course.repositories;

import com.cursoudemy.course.entities.OrderItem;
import com.cursoudemy.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
