package com.xworkz.dp.dto;

public class BusDriverDTO {
	
	private String driverName;
	private  int age;
	private int experience;
	private String busName;
	private String place;
	private double salary;
	private boolean government;
	
	public BusDriverDTO() {
		System.out.println("No-argument Constructor");		
	}

	public BusDriverDTO(String driverName, int age, int experience, String busName, String place, double salary,
			boolean government) {
		super();
		this.driverName = driverName;
		this.age = age;
		this.experience = experience;
		this.busName = busName;
		this.place = place;
		this.salary = salary;
		this.government = government;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isGovernment() {
		return government;
	}

	public void setGovernment(boolean government) {
		this.government = government;
	}
	
	

}
