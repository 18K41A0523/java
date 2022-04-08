package Assigns;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
	LinkedList<Users> al=new LinkedList<Users>();
	
	al.add(new Users(101,"adam","adam@mail.com"));
	al.add(new Users(102,"chintu","chim@mail.com"));
	al.add(new Users(103,"adami","Hyderabad@mail.com"));
	
	al.addFirst(new Users(106,"new user","user@mail.com"));
	 for(Users us:al) {
		 System.out.println(us);
	 }
}
}
