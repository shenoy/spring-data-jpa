package com.example.springdatajpa.springdatajpa.repository;
import com.example.springdatajpa.springdatajpa.controller.dto.OrderRequest;
import com.example.springdatajpa.springdatajpa.controller.dto.OrderResponse;
import com.example.springdatajpa.springdatajpa.entity.Customer;
import com.example.springdatajpa.springdatajpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT new com.example.springdatajpa.springdatajpa.controller.dto.OrderResponse(c.name, p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();

}
