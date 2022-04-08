package com.testapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShoppingCartTest2 {

	@Test
	void testgetBalance() {
		assertEquals(22.0,cart.getBalance());
	}

}
