package Assigns;

import java.util.Arrays;
import java.util.Objects;

public class Users implements Comparable<Users>{
	private int userId;
	private String userName;
	private String email;
	private String city;
	@Override
	public int compareTo(Users o) {
		// TODO Auto-generated method stub
		return this.getUserName().compareTo(o.getUserName());
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	String arr[]= {"java","C","C++","python"};
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + "]";
	}
public Users(int userId, String userName, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
	}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Arrays.hashCode(arr);
	result = prime * result + Objects.hash(city, email, userId, userName);
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Users other = (Users) obj;
	return Arrays.equals(arr, other.arr) && Objects.equals(city, other.city) && Objects.equals(email, other.email)
			&& userId == other.userId && Objects.equals(userName, other.userName);
}
}
	


