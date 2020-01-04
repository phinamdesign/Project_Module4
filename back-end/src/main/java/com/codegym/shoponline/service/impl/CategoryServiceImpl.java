package com.codegym.shoponline.service.impl;

import com.codegym.shoponline.model.Category;
import com.codegym.shoponline.repository.CategoryRepository;
import com.codegym.shoponline.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public Iterable<Category> findCategoryByName(String name) {
        return categoryRepository.findCategoryByName(name);
    }
}
