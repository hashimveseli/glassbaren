package com.example.glassbaren.repo;

import com.example.glassbaren.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//JpaRepository comes with useful methods
public interface CustomerRepo extends JpaRepository<Customer, Long> {
    void deleteCustomerById(Long id);

    Optional<Object> findCustomerById(Long id);
}
