package com.example.hexacode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hexacode.Entity.EventComment;
@Repository
public interface IEventCommentRepository extends JpaRepository<EventComment, Long> {

}
