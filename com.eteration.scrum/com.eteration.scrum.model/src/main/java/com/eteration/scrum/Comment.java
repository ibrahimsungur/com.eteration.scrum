package com.eteration.scrum;

import java.util.List;

public class Comment {

	private int commentId;
	private User user;
	private Question question;
	private int point;
	private List<Tag> tagList;

	public Comment(int commentId, int point) {
		super();
		this.commentId = commentId;
		this.point = point;
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public List<Tag> getTagList() {
		return tagList;
	}

	public void setTagList(List<Tag> tagList) {
		this.tagList = tagList;
	}

}
