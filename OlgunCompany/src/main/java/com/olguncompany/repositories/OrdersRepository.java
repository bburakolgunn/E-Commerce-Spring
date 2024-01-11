package com.olguncompany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olguncompany.entities.Basket;
import com.olguncompany.entities.Orders;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Orders, Long> {

}