package com.xworkz.bridge.Rules;

public class AfricaCitizen implements VotingRule,TrafficRules,MarriageRule{

	private String name;
	private String stateName;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getStateName() {
		return stateName;
	}


	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Override
	public int validAge() {
		System.out.println("Invoked valideAge() from Africa Citizen class");
		return 18;
	}
	
	@Override
	public String validId() {
		System.out.println("Invoked validId() from Africa Citizen class");
		return "27623hxgf9863";
	}
	
	@Override
	public boolean validLicence() {
		System.out.println("Invoked validLicence() from Africa Citizen class");
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


	public void displayDetails(){
		System.out.println("Invoked sisplay Details");
		System.out.println(this.name);
		System.out.println(this.stateName);
	}
}
