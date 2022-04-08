package com.minibank;

public class CustomerService {
	private Banking banking;
	
	public CustomerService(Banking banking) {
		super();
		this.banking=banking;
	}
     public String withdrawService(String amount) {
    	 return banking.deposit(amount);
     }
}
