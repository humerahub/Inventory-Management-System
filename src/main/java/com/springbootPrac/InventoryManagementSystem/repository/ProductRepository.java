package com.springbootPrac.InventoryManagementSystem.repository;

import com.springbootPrac.InventoryManagementSystem.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
