package com.example.ProjectWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjectWebServices.entities.OrderItem;


public interface OrdemItemRepository extends JpaRepository<OrderItem, Long>{

}
