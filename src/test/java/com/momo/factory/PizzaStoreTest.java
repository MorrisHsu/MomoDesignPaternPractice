package com.momo.factory;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class PizzaStoreTest {

	@Test
	public void orderPizza() {
		ByteArrayOutputStream stream =  new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(stream);
		System.setOut(printStream);
		
		PizzaStore pizzaStore = new PizzaStore();
		Pizza pizza = pizzaStore.orderPizza(PizzaType.cheese.name());
		
		assertTrue(pizza instanceof CheesePizza);
		assertFalse(pizza instanceof GreekPizza);
	}
	
}
