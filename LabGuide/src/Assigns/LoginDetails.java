package Assigns;

import java.util.Set;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Iterator;



public class LoginDetails {
	
	public void addSameKey(Map<Integer,String> map) {
		if(map.containsKey(1003)) {
			System.out.println("Key is already present in map");
		}
		map.put(1003, "John");
	}

}
