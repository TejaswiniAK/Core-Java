package com.xworkz.heirarchy.dto;

import java.io.Serializable;

public class ChocolateDTO implements Serializable {

	private String name,brand;
	private int rupees;
	
	public ChocolateDTO(String name, String brand, int rupees) {
		super();
		this.name = name;
		this.brand = brand;
		this.rupees = rupees;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getBrand() {
		return brand;
	}

	protected void setBrand(String brand) {
		this.brand = brand;
	}

	protected int getRupees() {
		return rupees;
	}

	protected void setRupees(int rupees) {
		this.rupees = rupees;
	}

	@Override
	public String toString() {
		return "ChocolateDTO [name=" + name + ", brand=" + brand + ", rupees=" + rupees + "]";
	}
	
	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode()");
		return 1119;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equal method");
		if(obj != null){
			if(obj instanceof ChocolateDTO){
				ChocolateDTO casted = (ChocolateDTO)obj;
				if(this.name.equals(casted.name) && this.brand.equals(casted.brand)){
					return true;
				}
			}
				
		}
		return false;
	}
	
}
