package com.xworkz.object.methods;

public class Aeroplane {

	private String company;
	private String govt;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "varshu";// super.toString();
	}

	@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return 99;//super.hashCode();
}

	@Override
public boolean equals(Object obj) {
	System.out.println("Invoked equals() of Object");
	if(obj!=null) {
		if(obj instanceof Aeroplane) {
			Aeroplane aero=(Aeroplane)obj;
			String com=aero.getCompany();
			String gov=aero.getGovt();
			if(this.company.equals(com) && this.govt.equals(gov)) {
				System.out.println("Govt and company is matched");
				return true;
			}
		}	
		}
		return false;	
}


	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getGovt() {
		return govt;
	}

	public void setGovt(String govt) {
		this.govt = govt;
	}
}