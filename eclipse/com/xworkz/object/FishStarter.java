package com.xworkz.object;

import com.xworkz.object.constants.FishType;
import com.xworkz.object.methods.Fish;

public class FishStarter {

	public static void main(String[] args) {
		
		Fish fish=new Fish("Chintu", FishType.COMMON_CARP, 6000.0F, "Orange");
		
		System.out.println(fish.toString());
		System.out.println(fish.hashCode());
		
		Fish fish2=new Fish("Chintu", FishType.COMMON_CARP, 6000.0F, "Orange");

		System.out.println(fish2.toString());
		System.out.println(fish2.hashCode());
		
		System.out.println(fish.equals(fish2));
	}
}
