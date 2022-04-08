package com.io;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class UserPersist {
	public static void main(String[] args) throws IOException{
		User user=new User(101,"santhosh","sonthosh@mail.com");
		
		System.out.println(user);
		FileOutputStream fos=new FileOutputStream("userdata.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(user);
		System.out.println("done");
		}

}
