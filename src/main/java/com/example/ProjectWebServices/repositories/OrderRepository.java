package com.example.ProjectWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjectWebServices.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
