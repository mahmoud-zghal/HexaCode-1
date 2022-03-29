package com.example.hexacode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import  com.example.hexacode.Entity.Level;
@Repository
public interface LevelRepository extends JpaRepository<Level, Long> {
}