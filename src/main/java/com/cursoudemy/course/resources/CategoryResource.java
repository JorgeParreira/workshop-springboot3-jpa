package com.cursoudemy.course.resources;

import com.cursoudemy.course.entities.Category;
import com.cursoudemy.course.entities.Order;
import com.cursoudemy.course.services.CategoryService;
import com.cursoudemy.course.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        return ResponseEntity.ok().body(categoryService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Category>> findyById(@PathVariable Long id) {
        return ResponseEntity.ok().body(categoryService.getUser(id));
    }

}
