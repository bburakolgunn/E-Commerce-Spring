package com.olguncompany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olguncompany.entities.Category;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {



}