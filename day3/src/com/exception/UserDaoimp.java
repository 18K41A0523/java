package com.exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class UserDaoimp implements UserDao{

	@Override
	public void addUser(User user) throws DAOException {
		
		try {
		       FileOutputStream fos=new FileOutputStream("c:\\");
		    }catch(FileNotFoundException e) {
		    	throw new DAOException
		    	("System went wrong",e);
	}
		
}
}

