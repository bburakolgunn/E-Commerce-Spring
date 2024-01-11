package com.olguncompany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olguncompany.entities.Customer;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByEmailEqualsIgnoreCase(String email);




    //Optional<Customer> findByPasswordEquals(String password);

    Optional<Customer> findByResetPasswordToken(String resetPasswordToken);

    Optional<Customer> findByEmail(String email);




}