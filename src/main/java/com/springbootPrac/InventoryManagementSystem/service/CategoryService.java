package com.springbootPrac.InventoryManagementSystem.service;

import com.springbootPrac.InventoryManagementSystem.dto.CategoryDTO;
import com.springbootPrac.InventoryManagementSystem.dto.Response;

public interface CategoryService {

    Response createCategory(CategoryDTO categoryDTO);
    Response getAllCategories();
    Response getCategoryById(Long id);
    Response updateCategory(Long id, CategoryDTO categoryDTO);
    Response deleteCategory(Long id);
}
