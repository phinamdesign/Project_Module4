package com.codegym.shoponline.service;

import com.codegym.shoponline.model.Category;
import com.codegym.shoponline.model.SubCategory;

import java.util.Optional;

public interface SubCategoryService {
    Optional<SubCategory> findById(Long id);

    Iterable<SubCategory> findAll();

    SubCategory save(SubCategory subCategory);

    void delete(Long id);

    Iterable<SubCategory> findSubCategoryByName(String name);
}
