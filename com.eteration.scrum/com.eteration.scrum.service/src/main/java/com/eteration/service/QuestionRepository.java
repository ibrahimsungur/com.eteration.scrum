package com.eteration.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eteration.scrum.Question;


@Repository
public interface QuestionRepository extends CrudRepository<Question, Integer>{
	
	
	

}
