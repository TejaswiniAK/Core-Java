package com.xworkz.inheritance.shop;

public class Factory {
	
	String name;
	String owner;
	int since;
	String product;
	float revenue;
	
	public Factory(String name) {
		this.name=name;
		System.out.println("Factory parameter invoked");
		System.out.println("Factory name : ".concat(name));
	}

}
