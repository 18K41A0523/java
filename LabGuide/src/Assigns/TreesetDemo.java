package Assigns;

import java.util.ArrayList;

public class TreesetDemo {
	 public static void main(String[] args) {
		 TreeSet<Users> al=new TreeSet<Users>();
			
			al.add(new Users(101,"adam","adam@mail.com"));
			al.add(new Users(102,"chintu","chim@mail.com"));
			al.add(new Users(103,"adami","Hyderabad@mail.com"));
			
			for(Users us:al) {
				System.out.println(us);
			}
			
			
	 }

}
