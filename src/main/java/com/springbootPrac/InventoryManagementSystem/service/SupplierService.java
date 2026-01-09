package com.springbootPrac.InventoryManagementSystem.service;

import com.springbootPrac.InventoryManagementSystem.dto.Response;
import com.springbootPrac.InventoryManagementSystem.dto.SupplierDTO;

public interface SupplierService {
    Response addSupplier(SupplierDTO supplierDTO);
    Response updateSupplier(Long id, SupplierDTO supplierDTO);
    Response getAllSuppliers();
    Response getSupplierById(Long id);
    Response deleteSupplier(Long id);
}
