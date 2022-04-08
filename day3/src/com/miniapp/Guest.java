package com.miniapp;

public class Guest {
	 public static void main(String args[]) {
		  FrontdeskService fds=new FrontdeskService(new AmericanRestaurant());
		  System.out.println(fds.takeOrder("pasta"));	 }

}
