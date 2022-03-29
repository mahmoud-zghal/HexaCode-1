package com.example.hexacode.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import  com.example.hexacode.Entity.Response;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

@Repository
public interface ResponseRepository extends JpaRepository<Response, Long>, PagingAndSortingRepository<Response, Long>, JpaSpecificationExecutor<Response> {
	List<Response> findByOrderByNbLikeDesc();

}
