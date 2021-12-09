package com.xworkz.heirarchy.dto;

import java.io.Serializable;

public class OfficeDTO implements Serializable {

	private String name,location,type;
	private int noOfStaffs;
	
	public OfficeDTO(String name, String location, String type, int noOfStaffs) {
		super();
		this.name = name;
		this.location = location;
		this.type = type;
		this.noOfStaffs = noOfStaffs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfStaffs() {
		return noOfStaffs;
	}

	public void setNoOfStaffs(int noOfStaffs) {
		this.noOfStaffs = noOfStaffs;
	}
	
	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode over-ride method");
		return 999;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals over-ride method");
		if(obj != null){
			if(obj instanceof OfficeDTO){
				OfficeDTO casted = (OfficeDTO)obj;
				
				if(this.name.equals(casted.name) && this.location.equals(casted.location)){
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "OfficeDTO [name=" + name + ", location=" + location + ", type=" + type + ", noOfStaffs=" + noOfStaffs
				+ "]";
	}
	
	
	
}
