package com.cursoudemy.course.services;

import com.cursoudemy.course.entities.Product;
import com.cursoudemy.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> getUser(Long id) {
        return productRepository.findById(id);
    }

}
