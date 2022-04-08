package Assigns;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Users> al=new ArrayList<Users>();
		
		al.add(new Users(101,"adam","adam@mail.com"));
		al.add(new Users(102,"chintu","chim@mail.com"));
		al.add(new Users(103,"adami","Hyderabad@mail.com"));
		
		Collections.sort(al,new NameOrder());
		
		for(Users us:al) {
        System.out.println(us);
	}
      
}
}
