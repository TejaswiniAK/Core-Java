package com.xworkz.object;


import com.xworkz.object.constants.HeadsetType;
import com.xworkz.object.methods.Headset;

public class HeadsetStarter {

	public static void main(String[] args) {

		Headset headset=new Headset("Sony", true, 2, HeadsetType.BLUETOOTH_HEADPHONES);
		
		System.out.println(headset.toString());
		System.out.println(headset.hashCode());
		
		Headset headset2=new Headset("Sony", true, 2, HeadsetType.BLUETOOTH_HEADPHONES);
		
		Headset headset3=new Headset("Sony", false, 0, HeadsetType.CLOSED_BACK_HEADPHONES);
		
		System.out.println(headset2.toString());
		System.out.println(headset2.hashCode());
		
		boolean b=headset.equals(headset2);
		System.out.println(b);
		System.out.println("-------------------------------------------------------------------");
		boolean b1=headset.equals(headset3);
		System.out.println(b1);
		System.out.println("-------------------------------------------------------------------");
		
		Class c=headset.getClass();
		System.out.println(c);
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		System.out.println(c.getTypeName());
		
		
	}

}
