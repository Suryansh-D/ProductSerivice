package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Product;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Override
    Optional<Product> findById(Long id);

    @Override
    Product save(Product product);
}