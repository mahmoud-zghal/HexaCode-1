package com.example.hexacode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import  com.example.hexacode.Entity.Subject;


@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
