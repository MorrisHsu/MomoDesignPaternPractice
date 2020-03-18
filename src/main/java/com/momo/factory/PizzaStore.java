package com.momo.factory;

public class PizzaStore {

	SimplePizzaFactory factory;

	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	Pizza orderPizza(String type) {
		Pizza pizza = null;
		pizza = this.factory.createPizza(type);
		pizza.prepare();
		pizza.cook();
		return pizza;
	}
}
