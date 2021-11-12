package com.xworkz.object;

import com.xworkz.object.methods.Belt;

public class BeltStarter {

	public static void main(String[] args) {
		
		Belt belt=new Belt(87.98F, "Cotton", 60, 'M');
		
		Belt belt2=new Belt(75.8F, "leather", 0, 'F');
		
		System.out.println(belt.toString());
		System.out.println(belt.hashCode());
		
		System.out.println(belt2.toString());
		System.out.println(belt2.hashCode());
		
		System.out.println(belt.equals(belt2));
	}
}
