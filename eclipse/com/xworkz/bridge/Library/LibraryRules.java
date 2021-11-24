package com.xworkz.bridge.Library;

public interface LibraryRules {

	String identityCard();

	double startTime();

	double returnTime();
	
	double lateFees();
	
	default double registrationFees(){
		System.out.println("Invoked registrationFees()");
		return 200;
	}
}
