package com.xworkz.object.methods;

import com.xworkz.object.constants.TyreType;

public class Tyre {

	private String brand;
	private int price;
	private TyreType tyre;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "tej";//super.toString();
	}
	
	@Override
	public int hashCode() {
		
		return 89;//super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals() of Object");
		if(obj!=null) {
			if(obj instanceof Tyre) {
				Tyre tyr=(Tyre)obj;
				String brand1=tyr.getBrand();
				TyreType typ=tyr.getTyre();
				if(this.brand.equals(brand1) && this.tyre.equals(typ)) {
					System.out.println("City and tyre type matched");
					return true;
				}
			}
			
		}
		return false;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setTyre(TyreType tyre) {
		this.tyre = tyre;
	}
	
	public TyreType getTyre() {
		return tyre;
	}
}
