package com.springbootPrac.InventoryManagementSystem.service;


import com.springbootPrac.InventoryManagementSystem.dto.LoginRequest;
import com.springbootPrac.InventoryManagementSystem.dto.RegisterRequest;
import com.springbootPrac.InventoryManagementSystem.dto.Response;
import com.springbootPrac.InventoryManagementSystem.dto.UserDTO;
import com.springbootPrac.InventoryManagementSystem.entity.User;

public interface UserService {
    Response registerUser(RegisterRequest registerRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    User getCurrentLoggedInUser();
    Response updateUser(Long id, UserDTO userDTO);
    Response deleteUser(Long id);
    Response getUserTransactions(Long id);
}