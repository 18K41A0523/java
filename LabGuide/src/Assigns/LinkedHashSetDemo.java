package Assigns;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
          LinkedHashSet<Users> al=new LinkedHashSet<Users>();
		
		al.add(new Users(101,"adam","adam@mail.com"));
		al.add(new Users(102,"chintu","chim@mail.com"));
		al.add(new Users(103,"adami","Hyderabad@mail.com"));
		
		for(Users us:al) {
			System.out.println(us);
		}
		
	}

}
