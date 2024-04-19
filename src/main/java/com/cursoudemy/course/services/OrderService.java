package com.cursoudemy.course.services;

import com.cursoudemy.course.entities.Order;
import com.cursoudemy.course.entities.User;
import com.cursoudemy.course.repositories.OrderRepository;
import com.cursoudemy.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Optional<Order> getUser(Long id) {
        return orderRepository.findById(id);
    }

}
