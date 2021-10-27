package com.xworkz.dp.dto;

public class CarpenterDTO {

	private String carpenterName;
	private int experience;
	private double salary;
	private String work;
	private int age;
	private String place;
	private String workingHours;

	public CarpenterDTO() {

		System.out.println("No-argument constructor");

	}

	public CarpenterDTO(String carpenterName, int experience, double salary, String work, int age, String place,
			String workingHours) {
		super();
		this.carpenterName = carpenterName;
		this.experience = experience;
		this.salary = salary;
		this.work = work;
		this.age = age;
		this.place = place;
		this.workingHours = workingHours;
	}

	public String getCarpenterName() {
		return carpenterName;
	}

	public void setCarpenterName(String carpenterName) {
		this.carpenterName = carpenterName;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(String workingHours) {
		this.workingHours = workingHours;
	}

}
