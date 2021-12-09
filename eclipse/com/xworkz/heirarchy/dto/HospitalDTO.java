package com.xworkz.heirarchy.dto;

import java.io.Serializable;

//5. Use Serializable marker interface
public class HospitalDTO implements Serializable {
	
	//1. Instance variables should be private access-specifier
	
	private String name,address,type;
	private int noOfStaffs;
	private long phoneNo;
	
	//2. Create Constuctore for instanciation
	public HospitalDTO(String name, String address, String type, int noOfStaffs, long phoneNo) {
		super();
		this.name = name;
		this.address = address;
		this.type = type;
		this.noOfStaffs = noOfStaffs;
		this.phoneNo = phoneNo;
	}
	
	//3. To Access variables use Encapsulation(Getter and Setter methods)
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode()");
		return 666;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals over-ride method ");
		if (obj != null) {
			if(obj instanceof HospitalDTO){
				HospitalDTO casted = (HospitalDTO)obj;
				if(this.name.equals(casted.name) && this.address.equals(casted.address)){
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "HospitalDTO [name=" + name + ", address=" + address + ", type=" + type + ", noOfStaffs=" + noOfStaffs
				+ ", phoneNo=" + phoneNo + "]";
	}
	
	

}
