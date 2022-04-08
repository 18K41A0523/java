package com.minibank;

public class BankingClient {
	public static void main(String args[]) {
		CustomerService cs=new CustomerService(new SBIBank());
		System.out.println(cs.withdrawService("1000"));
	}

}
