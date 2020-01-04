package com.codegym.shoponline.controller;

import com.codegym.shoponline.model.Category;
import com.codegym.shoponline.model.SubCategory;
import com.codegym.shoponline.service.CategoryService;
import com.codegym.shoponline.service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class SubCategoryController {
    @Autowired
    private SubCategoryService subCategoryService;

    @Autowired
    private CategoryService categoryService;

    @ModelAttribute("categories")
    public Iterable<Category> categories(){
        return categoryService.findAll();
    }

    @GetMapping("/user/subCategory")
    public ResponseEntity<?> listSubCategory(){
        List<SubCategory> subCategories = (List<SubCategory>) subCategoryService.findAll();

        if(subCategories.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(subCategories,HttpStatus.OK);
    }
}
