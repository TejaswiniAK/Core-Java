package com.xworkz.bridge.Library;

public class MaklaLibraryRules implements LibraryRules {

	@Override
	public String identityCard() {
		System.out.println("Invoked identityCard");
		return "2KA17CS046";
	}

	@Override
	public double startTime() {
		System.out.println("Invoked startTime");
		return 9.00;
	}

	@Override
	public double returnTime() {
		System.out.println("Invoked returnTime");
		return 14.00;
	}

	@Override
	public double lateFees() {
		System.out.println("Invoked lateFees()");
		return 10;
	}

	@Override
	public double registrationFees() {
		System.out.println("Invoked over-ride registrationFees() ");
		return LibraryRules.super.registrationFees();
	}
}
