package com.io;

import java.io.Serializable;

public class User implements Serializable { 
	
	
	private static final long serailVersionUID=1L;
	private int userId;
	private String userName;
	private String email;
	private String city;
	String arr[]= {"java","C","C++","python"};
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + "]";
	}
public User(int userId, String userName, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
	}
}
	
	
	
	


