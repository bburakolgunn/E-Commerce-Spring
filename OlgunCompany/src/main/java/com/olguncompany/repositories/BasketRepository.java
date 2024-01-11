package com.olguncompany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olguncompany.entities.Basket;

import java.util.List;

public interface BasketRepository extends JpaRepository<Basket, Long> {
    List<Basket> findByCustomer_EmailEqualsIgnoreCaseAndStatusFalse(String email);

    List<Basket> findByStatusIsTrueAndCustomer_EmailEqualsIgnoreCase(String email);


}