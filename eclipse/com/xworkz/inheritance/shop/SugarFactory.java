package com.xworkz.inheritance.shop;

public class SugarFactory extends Factory {
	
	public SugarFactory() {
		this(1956);
		System.out.println("Invoked SugarFactory Default no-arg constractor");
	}
	
	public SugarFactory(int since){
		super(" Lakshmi ");
		System.out.println("Invoked parameter constructor");
		System.out.println("Since : ".concat(String.valueOf(since)));
	}

}
