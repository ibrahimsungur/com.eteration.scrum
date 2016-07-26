package com.eteration.scrum;


public class User {

	private int id;
	private String userName;
	private String userPassword;
	private String email;
	private boolean enable;
	private int point;

	public User(String userName, String userPassword, String email, boolean enable, int point) {
		super();

		this.userName = userName;
		this.userPassword = userPassword;
		this.email = email;
		this.enable = enable;
		this.point = point;
	}

	public User(int id, String userName, String userPassword, String email, boolean enable, int point) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPassword = userPassword;
		this.email = email;
		this.enable = enable;
		this.point = point;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	

}
