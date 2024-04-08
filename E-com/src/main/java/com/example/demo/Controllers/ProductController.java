package com.example.demo.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Controllers.ProductController;
import com.example.demo.services.ProductService;
import com.example.demo.models.Product;

import java.util.*;
@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;
    ProductController(ProductService productService) {
        this.productService = productService;
    }
    // @GetMapping("/{id}")
    // public ResponseEntity getProductById(@PathVariable("id") Long id){
    //     return productService.getProductById(id);
    // }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
}
