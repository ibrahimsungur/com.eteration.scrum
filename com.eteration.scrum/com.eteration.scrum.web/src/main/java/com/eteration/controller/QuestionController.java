package com.eteration.controller;


import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eteration.scrum.Question;
import com.eteration.service.QuestionRepository;


@RestController
public class QuestionController {

	@Autowired
	private QuestionRepository repo;

	@RequestMapping(value = "/questions", method = RequestMethod.GET)
	public List<Question> getQuestionList() {

		return (List<Question>) repo.findAll();
	}
	
	
	@RequestMapping(value = "/question", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE, method = RequestMethod.PUT)
	public Question add(@RequestBody Question question) {
		return repo.save(question);
	}


}
