package Assigns;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<Integer,Users> hm=new HashMap<Integer,Users>();
       

		hm.put(10120,new Users(101,"adam","adam@mail.com"));
		hm.put(10121,new Users(102,"chintu","chim@mail.com"));
		for(Map.Entry data:hm.entrySet()){
		System.out.println(data.getKey()+" "+data.getValue());
       
	}

	}
}
