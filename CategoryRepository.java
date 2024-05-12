package com.machinecode.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machinecode.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
