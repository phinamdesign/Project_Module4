package com.codegym.shoponline.config;

import com.codegym.shoponline.repository.SubCategoryRepository;
import com.codegym.shoponline.service.CategoryService;
import com.codegym.shoponline.service.SubCategoryService;
import com.codegym.shoponline.service.impl.CategoryServiceImpl;
import com.codegym.shoponline.service.impl.SubCategoryServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {
   @Bean
    public CategoryService categoryService(){
       return new CategoryServiceImpl();
   }

    @Bean
    public SubCategoryService subCategoryService(){
        return new SubCategoryServiceImpl();
    }
}
