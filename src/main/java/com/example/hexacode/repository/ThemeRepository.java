package com.example.hexacode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import  com.example.hexacode.Entity.Theme;
@Repository
public interface ThemeRepository extends JpaRepository<Theme, Long> {
}