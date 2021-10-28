package com.xworkz.dp.dto;

import com.xworkz.dp.constants.CourtType;

public class LawyerDTO {

	private String name;
	private String qualification;
	private int experience;
	private char gender;
	private int age;
	private CourtType type;
	private int casesWon;
	private int casesLost;
	
	public LawyerDTO() {
		System.out.println("Invoked LawyerDTO no-arg constructor");
		System.out.println();
	}

	public LawyerDTO(String name, String qualification, int experience, char gender, int age, CourtType type,
			int casesWon, int casesLost) {
		super();
		this.name = name;
		this.qualification = qualification;
		this.experience = experience;
		this.gender = gender;
		this.age = age;
		this.type = type;
		this.casesWon = casesWon;
		this.casesLost = casesLost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public CourtType getType() {
		return type;
	}

	public void setType(CourtType type) {
		this.type = type;
	}

	public int getCasesWon() {
		return casesWon;
	}

	public void setCasesWon(int casesWon) {
		this.casesWon = casesWon;
	}

	public int getCasesLost() {
		return casesLost;
	}

	public void setCasesLost(int casesLost) {
		this.casesLost = casesLost;
	}
	
	
	
}
