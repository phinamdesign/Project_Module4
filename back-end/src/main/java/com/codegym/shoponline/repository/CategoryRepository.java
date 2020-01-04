package com.codegym.shoponline.repository;

import com.codegym.shoponline.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Iterable<Category> findCategoryByName(String name);
}
