package com.example.springdatajpa.springdatajpa.repository;

import com.example.springdatajpa.springdatajpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
