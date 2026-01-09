package com.springbootPrac.InventoryManagementSystem.exceptions;

public class NotFoundException extends RuntimeException{

    public NotFoundException(String message){
        super(message);
    }
}
