package com.minibank;

public class SBIBank implements Banking{
     public String deposit(String amo) {
    	 return "deposited"+amo;
     }
     public void checkBalance() {
    	 System.out.println("Checked");
     }
     
}
