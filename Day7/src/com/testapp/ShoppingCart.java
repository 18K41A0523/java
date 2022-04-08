package com.testapp;

import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart {
	private ArrayList<Product> al;
	
	public ShoppingCart() {
		al=new ArrayList<Product>();
	}
	
	public void addItem(Product product) {
		al.add(product);
	}
	public int getItemscount() {
		return al.size();
	}
	public void removeProduct(Product item)
	throws ProductNotFoundException
	{
		if(!al.remove(item)) {
			throw new ProductNotFoundException();
		}
	}
	public double getBalance() {
		double balance=0.0;
		
		for(Iterator i=al.iterator();i.hasNext();) {
			Product item=(Product) i.next();
			balance+=item.getPrice();
		}
		return balance;
	}
	}


