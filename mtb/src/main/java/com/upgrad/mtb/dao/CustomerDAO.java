package com.upgrad.mtb.dao;

import com.upgrad.mtb.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("customerDAO")
public interface CustomerDAO extends JpaRepository<Customer, Integer> {
    Optional<Customer> findByUsername(String username);

}
