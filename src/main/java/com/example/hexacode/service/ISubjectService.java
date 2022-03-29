package com.example.hexacode.service;

import java.util.List;

import  com.example.hexacode.Entity.Subject;



public interface ISubjectService {
	List<Subject> retrieveAllSubject();
	Subject addSubject(Subject s);
	void deleteSubjectById(Long id);
	void deleteSubject(Subject s);
	Subject updateSubject(Subject s);
	Subject retrieveSubjectById(Long id);
	}


