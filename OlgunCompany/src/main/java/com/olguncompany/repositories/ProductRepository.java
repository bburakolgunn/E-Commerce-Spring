package com.olguncompany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olguncompany.entities.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategory_IdEqualsOrderByProductNameAsc(Long id);
    List<Product> findByProductNameContainsIgnoreCaseOrDetailContainsIgnoreCase(String productName, String detail);





}