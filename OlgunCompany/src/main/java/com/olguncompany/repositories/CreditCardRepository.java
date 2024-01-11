package com.olguncompany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olguncompany.entities.CreditCard;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {
}