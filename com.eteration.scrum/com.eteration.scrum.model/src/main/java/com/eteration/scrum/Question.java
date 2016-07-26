package com.eteration.scrum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int questionId;
	private String question;
	
	@Transient
	private User user;
	private int rate;

	
	
	public Question(int questionId, String question, User user, int rate) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.user = user;
		this.rate = rate;
	}
	public Question() {
		 
	}
	 

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

}
