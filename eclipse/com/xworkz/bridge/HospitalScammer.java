package com.xworkz.bridge;

import com.xworkz.bridge.Hospital.Hospital;
import com.xworkz.bridge.Hospital.HospitalAdmitRule;
import com.xworkz.bridge.Hospital.HospitalDischargeRules;
import com.xworkz.bridge.Hospital.Patient;

public class HospitalScammer {

	public static void main(String[] args) {

		HospitalAdmitRule admitRule = new Patient();
		HospitalDischargeRules dischargeRules = new Patient();

		Hospital hospital = new Hospital("Kiran", "Benglore", "Gov", admitRule, dischargeRules);
		hospital.displayDetails();
		System.out.println("-----------------------------------------------");
		hospital.admitPatient();
		System.out.println("-----------------------------------------------");
		hospital.dischargePatient();
		System.out.println("-----------------------------------------------");

	}

	/*
	 * getDetails("rt" ,45); }
	 * 
	 * 
	 * public static void getDetails(Object name,Object email) {
	 * 
	 * }
	 */
}
