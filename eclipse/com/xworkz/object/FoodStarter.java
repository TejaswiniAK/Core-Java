package com.xworkz.object;

import com.xworkz.object.methods.Food;

public class FoodStarter {

	public static void main(String[] args) {
		
		Food food =new Food("Idli", 30.0F, 1, "Good");
		
		System.out.println(food.toString());
		System.out.println(food.hashCode());
		
		Food food2 =new Food("Idli", 30.0F, 1, "Good");
		
		System.out.println(food.toString());
		System.out.println(food.hashCode());
		
		System.out.println(food.equals(food2));
	}
}
