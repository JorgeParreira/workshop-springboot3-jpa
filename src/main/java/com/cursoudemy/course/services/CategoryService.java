package com.cursoudemy.course.services;

import com.cursoudemy.course.entities.Category;
import com.cursoudemy.course.entities.Order;
import com.cursoudemy.course.repositories.CategoryRepository;
import com.cursoudemy.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Optional<Category> getUser(Long id) {
        return categoryRepository.findById(id);
    }

}
