package com.codegym.shoponline.service.impl;

import com.codegym.shoponline.model.SubCategory;
import com.codegym.shoponline.repository.SubCategoryRepository;
import com.codegym.shoponline.service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class SubCategoryServiceImpl implements SubCategoryService {
    @Autowired
    private SubCategoryRepository subCategoryRepository;
    @Override
    public Optional<SubCategory> findById(Long id) {
        return subCategoryRepository.findById(id);
    }

    @Override
    public Iterable<SubCategory> findAll() {
        return subCategoryRepository.findAll();
    }

    @Override
    public SubCategory save(SubCategory subCategory) {
        return subCategoryRepository.save(subCategory);
    }

    @Override
    public void delete(Long id) {
        subCategoryRepository.deleteById(id);
    }

    @Override
    public Iterable<SubCategory> findSubCategoryByName(String name) {
        return subCategoryRepository.findSubCategoryByName(name);
    }
}
