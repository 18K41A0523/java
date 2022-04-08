package com.stream;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> members=new ArrayList<String>();
		
		members.add("admin");
		members.add("administrator");
		members.add("manager");
		members.add("testor");
       List<String> newdata= members.stream().sorted().filter((s)->s.startsWith("a")).map(String::toUpperCase).collect(Collectors.toList());
       System.out.println(newdata);
       
       long data=members.stream().filter((s)->s.startsWith("a")).count();
       System.out.println(data);
	}

}
