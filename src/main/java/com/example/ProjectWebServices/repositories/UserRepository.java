package com.example.ProjectWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjectWebServices.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
