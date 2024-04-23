package com.example.demo.exceptions;

import com.example.*;
public class CategoryNotFoundException extends RuntimeException {
    public CategoryNotFoundException(String message){
        super(message);
    }
}
