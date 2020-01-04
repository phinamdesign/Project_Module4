package com.codegym.shoponline.service;

import com.codegym.shoponline.model.Category;

import java.util.Optional;

public interface CategoryService {
    Optional<Category> findById(Long id);

    Iterable<Category> findAll();

    Category save(Category category);

    void delete(Long id);

    Iterable<Category> findCategoryByName(String name);
}
