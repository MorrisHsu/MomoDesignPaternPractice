package com.momo.factory;

public class PizzaStore {
	
    Pizza orderPizza(String type){
    	Pizza pizza = null;
    	if(type.equals("cheese")){
	    pizza = new CheesePizza();
    	}else if(type.equals("greek")){
	    pizza = new GreekPizza();
    	}else if(type.equals("pepperoni")){
	    pizza = new PepperoniPizza();
    	}
    	pizza.prepare();
    	pizza.cook();
    	return pizza;
    }
}
