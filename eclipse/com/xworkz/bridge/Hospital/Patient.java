package com.xworkz.bridge.Hospital;

public class Patient extends Hospital implements HospitalAdmitRule, HospitalDischargeRules {

	@Override
	public String register() {
		System.out.println("Invoked register() ");
		return "Aakash";
	}

	@Override
	public double payAdvance() {
		System.out.println("Invoked payAdvance()");
		return 10000;
	}

	@Override
	public boolean validInsurance() {
		System.out.println("Invoked validInsurance()");
		return true;
	}

	@Override
	public boolean payBill() {
		System.out.println("Invoked payBill()");
		return true;
	}

	@Override
	public double discount() {
		System.out.println("Invoked discount()");
		return 10000;
	}

}
