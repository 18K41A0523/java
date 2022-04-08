package Assigns;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;


public class EntrySet {
	
	public void printSetRecords(Set<String> set) {
		if(set.isEmpty()) {
			System.out.println("Empty set");
		}
		else {
			System.out.println("set elements are :"+set);
		}
	}
public static void main(String args[]) {
	Set<String> set=new HashSet<String>();
	set.add("First Entry");
	set.add("Second entry");
	set.add("Third Entry");
	set.add("First Entry");
	EntrySet setDemo=new EntrySet();
	setDemo.printSetRecords(set);
	Set<String> emptySet=new HashSet<String>();
	setDemo.printSetRecords(emptySet);
	
}

}
