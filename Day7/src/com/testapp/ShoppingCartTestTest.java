
package com.testapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;


import org.junit.jupiter.api.Test;

class ShoppingCartTest {
	private ShoppingCart cart=new ShoppingCart();
	Product p1;
	Product p2;
	
	@BeforeEach
	public void addDefaults() {
		p1=new Product("soap",10);
		p2=new Product("book",12);
		cart.addItem(p1);
		cart.addItem(p2);
	}
	@Test
	void testTestAddItem() {
		assertEquals(2,cart.getItemscount());
	}
     
	void testRemove() throws ProductNotFoundException {
		cart.removeProduct(p1);
		assertEquals(1,cart.getItemscount());
	}
}
