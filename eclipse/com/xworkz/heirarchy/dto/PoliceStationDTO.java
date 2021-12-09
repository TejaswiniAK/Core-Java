package com.xworkz.heirarchy.dto;

import java.io.Serializable;

public class PoliceStationDTO implements Serializable {

	private String name, type, location;
	private int noOfStaffs;

	public PoliceStationDTO(String name, String type, String location, int noOfStaffs) {
		super();
		this.name = name;
		this.type = type;
		this.location = location;
		this.noOfStaffs = noOfStaffs;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getType() {
		return type;
	}

	protected void setType(String type) {
		this.type = type;
	}

	protected String getLocation() {
		return location;
	}

	protected void setLocation(String location) {
		this.location = location;
	}

	protected int getNoOfStaffs() {
		return noOfStaffs;
	}

	protected void setNoOfStaffs(int noOfStaffs) {
		this.noOfStaffs = noOfStaffs;
	}

	@Override
	public String toString() {
		return "PoliceStationDTO [name=" + name + ", type=" + type + ", location=" + location + ", noOfStaffs="
				+ noOfStaffs + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode");
		return 5;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals()");
		if (obj != null) {
			if (obj instanceof PoliceStationDTO) {
				PoliceStationDTO casted = (PoliceStationDTO) obj;
				
				if (this.name.equals(casted.name) && this.equals(casted.location)) {
					return true;
				}
			}
		}
		return false;
	}

}
