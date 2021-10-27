package com.xworkz.dp.dto;

public class TimerDTO {

	private String correctTime;
	private boolean digital;
	private boolean bell;
	private String brand;
	
	public TimerDTO() {
		System.out.println("invoke TimerDTO constructor");
	}

	public TimerDTO(String correctTime, boolean digital, boolean bell, String brand) {
		super();
		this.correctTime = correctTime;
		this.digital = digital;
		this.bell = bell;
		this.brand = brand;
	}

	public String getCorrectTime() {
		return correctTime;
	}

	public void setCorrectTime(String correctTime) {
		this.correctTime = correctTime;
	}

	public boolean isDigital() {
		return digital;
	}

	public void setDigital(boolean digital) {
		this.digital = digital;
	}

	public boolean isBell() {
		return bell;
	}

	public void setBell(boolean bell) {
		this.bell = bell;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
