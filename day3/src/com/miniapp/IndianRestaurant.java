package com.miniapp;

public class IndianRestaurant implements Restaurant {

	@Override
	public String prepareFood(String disName) {
		// TODO Auto-generated method stub
		return "preparing"+disName+"with Indian Spices";
	}

}
