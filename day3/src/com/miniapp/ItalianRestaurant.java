package com.miniapp;

public class ItalianRestaurant implements Restaurant{

	@Override
	public String prepareFood(String disName) {
		// TODO Auto-generated method stub
		return "preparing" + disName + "with Italian Spices";
	}

}
