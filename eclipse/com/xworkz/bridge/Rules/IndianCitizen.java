package com.xworkz.bridge.Rules;

import com.xworkz.bridge.constants.Address;

public class IndianCitizen implements VotingRule,TrafficRules,MarriageRule{

	private String name;
	private Address address;
	
	public IndianCitizen(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	@Override
	public int validAge() {
		System.out.println("Invoked validAge() method from IndianCitizen class");
		return 21;
	}
	
	@Override
	public String validId() {
		System.out.println("Invoked validId() method from IndianCitizen class");
		return null;
	}
	
	@Override
	public boolean validLicence() {
		System.out.println("Invoked validLicence() method from IndianCitizen class");
		return false;
	}
	
	@Override
	public String licenseNo() {
		System.out.println("Invoked licenseNo() method from IndianCitizen class");
		return "25 KA 9988";
	}
	
	@Override
	public boolean validInsurance() {
		System.out.println("Invoked validInsurance() method from IndianCitizen class");
		return false;
	}
	
	@Override
	public boolean validAge(char gender, int age) {
		System.out.println("Invoked validAge() method from IndianCitizen class");
		
		if(gender=='M' && age>=21){
			System.out.println("Gender : ".concat(String.valueOf(gender)).concat("  and age : ").concat(String.valueOf(age)));
			return true;
		}
		if(gender=='F' && age>=18){
			System.out.println("Gender : ".concat(String.valueOf(gender)).concat("  and age : ").concat(String.valueOf(age)));
			return true;
		}
		return false;
	}
	
	public void displayNameAndAddressDetails(){
		System.out.println("Invoked display Details...");
		System.out.println(this.name);
		System.out.println(this.address);
	}
}
