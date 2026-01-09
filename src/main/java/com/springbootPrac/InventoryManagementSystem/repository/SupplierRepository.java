package com.springbootPrac.InventoryManagementSystem.repository;

import com.springbootPrac.InventoryManagementSystem.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
