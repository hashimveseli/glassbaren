package com.example.glassbaren.service;

import com.example.glassbaren.exception.UserNotFoundException;
import com.example.glassbaren.model.Customer;
import com.example.glassbaren.repo.CustomerRepo;
import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CustomerService {
    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public Customer addCustomer(Customer customer) {
        //Create the customer in the database
        customer.setCustomerCode(UUID.randomUUID().toString());
        return customerRepo.save(customer);
    }

    public List<Customer> findAllCustomer() {
        return customerRepo.findAll();
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    //skapar Query-metod nedan letar efter employee via id
    public Optional findCustomerById(Long id) {
        return (Optional) customerRepo.findCustomerById(id).orElseThrow(() -> new UserNotFoundException("User by id: " + id + "was not found"));
                //.orElseThrow(() -> new UserPrincipalNotFoundException("User by id " + id + "was not found"));
    }

    public void deleteCustomer(Long id) {
        customerRepo.deleteCustomerById(id);
    }
}
