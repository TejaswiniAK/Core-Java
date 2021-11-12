package com.xworkz.object;

import com.xworkz.object.constants.PlantType;
import com.xworkz.object.methods.Plant;

public class PlantStarter {

	public static void main(String[] args) {
		
		Plant plant=new Plant("Coconut", true, 4, PlantType.TREES);
		
		System.out.println(plant.toString());
		System.out.println(plant.hashCode());
		
		Plant plant2=new Plant("Aalad", true, 30, PlantType.TREES);
		
		System.out.println(plant2.toString());
		System.out.println(plant2.hashCode());
		
		Plant plant3=new Plant("Aalad", true, 30, PlantType.TREES);
		
		System.out.println(plant2.toString());
		System.out.println(plant2.hashCode());
		
		boolean b=plant.equals(plant2);
		System.out.println(b);
		
		boolean c=plant2.equals(plant3);
		System.out.println(c);
	}
}
