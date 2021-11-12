package com.xworkz.object;

import com.xworkz.object.constants.BagColor;
import com.xworkz.object.methods.Bag;

public class BagStarter {

	public static void main(String[] args) {

		Bag bag=new Bag(65.97f, 4, BagColor.RED);
		
		System.out.println(bag.toString());
		System.out.println(bag.hashCode());
		
		Bag bag1=new Bag(65.97f, 4, BagColor.RED);
		
		System.out.println(bag1.toString());
		System.out.println(bag1.hashCode());
		
		System.out.println(bag.equals(bag1));
	}

}
