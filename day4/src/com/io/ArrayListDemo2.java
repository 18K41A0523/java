package com.io;

import java.util.ArrayList;

public class ArrayListDemo2 {
	
	public static void main(String args[]) {
		
		ArrayList<Project> al=new ArrayList<Project>();
		al.add(new Project(101,"adam","Hyderabad",2000));
		al.add(new Project(102,"adami","Mumbai",2002));
	    al.add(new Project(103,"adama","Kerala",2004));
	    
	    for(Project p:al) {
	    	System.out.println(p);
	    }
	}
}
