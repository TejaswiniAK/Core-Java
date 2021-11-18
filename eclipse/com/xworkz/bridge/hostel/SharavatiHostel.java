package com.xworkz.bridge.hostel;

//The type SharavatiHostel must implement the inherited abstract method HostelRules.inTime()
public class SharavatiHostel implements HostelRules,visitingDay{

	@Override
	public int inTime() {
		System.out.println("Invoked inTime() from Sharavati Hostel");
		return 10;
	}

	@Override
	public String visitingDay() {
		System.out.println("Invoked visiting Day from Sharavati Hostel");
		return "SUNDAY";
	}
	
}
