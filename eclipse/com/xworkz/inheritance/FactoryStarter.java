package com.xworkz.inheritance;

import com.xworkz.inheritance.shop.Factory;
import com.xworkz.inheritance.shop.SugarFactory;

public class FactoryStarter {

	public static void main(String[] args) {

		SugarFactory sugarFactory=new SugarFactory();
		System.out.println();
		
		sugarFactory=new SugarFactory();
		System.out.println();
		
		Factory factory=new Factory("Venkateshwar");
		System.out.println();
		
		factory=new SugarFactory();
		System.out.println();
		
		Object object=new Object();
		
		object=new Factory(" mndbfdhbvcm ");
		System.out.println();
		
		object=new SugarFactory(2021);
		
	}

}
