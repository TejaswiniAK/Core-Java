package com.xworkz.object;

import com.xworkz.object.constants.WatchType;
import com.xworkz.object.methods.Watch;

public class WatchStarter {

	public static void main(String[] args) {

		Watch watch=new Watch();
		System.out.println(watch);
		watch.toString();//here if you return statement then you have to write in print() method
		System.out.println(watch.toString());
		watch.hashCode();//nothing prints
		System.out.println(watch.hashCode());//if hashCode() is not over-ridden then o/p:- 366712642
		
		watch.setBrand("Rolex");
		watch.setWatchType(WatchType.ANALOG_WATCH);
		
		Watch watch2=new Watch();
		
		watch2.setBrand("Rolex");
		watch2.setWatchType(WatchType.DIGITAL_WATCH);
		
		boolean b=watch.equals(watch2);
		System.out.println(b);
		
		
	}

}
