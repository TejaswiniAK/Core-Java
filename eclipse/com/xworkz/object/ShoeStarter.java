package com.xworkz.object;

import com.xworkz.object.methods.Shoe;

public class ShoeStarter {

	public static void main(String[] args) {

		Shoe shoe=new Shoe("nike", 30, "black", "M");
		
		System.out.println(shoe.toString());
		System.out.println(shoe.hashCode());
		
		Shoe shoe2=new Shoe("adidas", 38, "Red", "F");
		
		System.out.println(shoe2.toString());
		System.out.println(shoe2.hashCode());
		
		System.out.println(shoe.equals(shoe2));
	}

}
