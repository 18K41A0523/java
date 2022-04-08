package com.io;

public class Project {
	 private int pid;
	 private String pName;
	 private String location;
	 private int budget;
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pName=" + pName + ", location=" + location + ", budget=" + budget + "]";
	}
	public Project(int pid, String pName, String location, int budget) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.location = location;
		this.budget = budget;
	}
	
	 

}
