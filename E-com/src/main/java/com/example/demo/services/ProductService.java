package com.example.demo.services;

import com.example.demo.models.Product;
import java.util.*;
public interface ProductService {
    Product getProductById(Long id);
    List<Product> getAllProducts();
}
