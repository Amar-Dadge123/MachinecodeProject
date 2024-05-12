package com.machinecode.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machinecode.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
