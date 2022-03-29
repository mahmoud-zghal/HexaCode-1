package com.example.hexacode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import  com.example.hexacode.Entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long>{

}
