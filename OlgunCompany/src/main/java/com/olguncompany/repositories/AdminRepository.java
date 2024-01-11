package com.olguncompany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olguncompany.entities.Admin;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

    Optional<Admin> findByPassword(String password);

    Optional<Admin> findByEmailEqualsIgnoreCase(String email);

}