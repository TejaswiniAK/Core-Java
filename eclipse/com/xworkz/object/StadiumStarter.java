package com.xworkz.object;

import com.xworkz.object.methods.Stadium;

public class StadiumStarter {

	public static void main(String[] args) {

		Stadium stadium=new Stadium("R N Shetty", "Dharwad", 1000);
		
		System.out.println(stadium.toString());
		System.out.println(stadium.hashCode());
		
		Stadium stadium2=new Stadium("R N Shetty", "Dharwad", 1000);

		System.out.println(stadium.toString());
		System.out.println(stadium.hashCode());
		
		System.out.println(stadium.equals(stadium2));
	}

}
