package Assigns;

import java.util.HashSet;

public class SetDemo {
	public static void main(String args[]) {
		HashSet<Users> al= new HashSet<Users>();
		
		al.add(new Users(101,"adam","adam@mail.com"));
		al.add(new Users(102,"chintu","chim@mail.com"));
		al.add(new Users(101,"adami","Hyderabad@mail.com"));
		al.add(new Users(102,"chintu","chim@mail.com"));
		
		
		for(Users us:al) {
			System.out.println(us);
		}
	}

}
