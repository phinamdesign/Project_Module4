package com.codegym.shoponline.repository;

import com.codegym.shoponline.model.Category;
import com.codegym.shoponline.model.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {
    Iterable<SubCategory> findSubCategoryByName(String name);
}
