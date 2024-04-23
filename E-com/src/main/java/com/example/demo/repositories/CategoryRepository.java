package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Category;
import com.example.demo.models.Product;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

    @Override
    Category save(Category category);
}
