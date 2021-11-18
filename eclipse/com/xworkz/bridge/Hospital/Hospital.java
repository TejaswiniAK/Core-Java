package com.xworkz.bridge.Hospital;

public class Hospital {

	private String name;
	private String location;
	private String govt;
	private HospitalAdmitRule admitRule;
	private HospitalDischargeRules dischargeRules;

	public Hospital() {
		System.out.println("Hospital no-arg constructor");
	}

	public Hospital(String name, String location, String govt, HospitalAdmitRule admitRule,
			HospitalDischargeRules dischargeRules) {
		super();
		this.name = name;
		this.location = location;
		this.govt = govt;
		this.admitRule = admitRule;
		this.dischargeRules = dischargeRules;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public String getGovt() {
		return govt;
	}

	public HospitalAdmitRule getAdmitRule() {
		return admitRule;
	}

	public HospitalDischargeRules getDischargeRules() {
		return dischargeRules;
	}

	public void admitPatient() {
		System.out.println("Invoked admitPatient()");
		String patientName = this.name;
		double advance = admitRule.payAdvance();
		boolean insurence = admitRule.validInsurance();

		if (patientName != null) {
			System.out.println("Patient Registered and Name : ".concat(patientName));

			if (advance >= 10000 || insurence == false) {
				System.out
						.println("payed advance ".concat(String.valueOf(advance))
								.concat(" and not having insurence"));
				if (insurence) {
					System.out.println("Have Insurence Dont have to pay advance");
				} else {
					System.err.println("Pay advance atleast Rs.10000");
				}

			} else {
				System.err.println("advance not payed");
			}

		} else {
			System.out.println("Patient not registered");
		}
	}

	public void dischargePatient() {
		System.out.println("Invoked dischargePatient()");
		
		boolean bill=dischargeRules.payBill(); 
		double concision=dischargeRules.discount();
		
		if(bill){
			System.out.println("Pay full amount");
			
			if(concision <= 2000){
				System.out.println("Have concision of ".concat(String.valueOf(concision)));
			}else {
				System.err.println("Dont have discount");
			}
		}else {
			System.err.println("Dont have to pay ");
		}

	}

	public void displayDetails() {
		System.out.println("Invoked displayDetails() ");
		System.out.println(this.name);
		System.out.println(this.location);
		System.out.println(this.govt);
	}

}
