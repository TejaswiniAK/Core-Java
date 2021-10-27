package com.xworkz.dp.dto;

public class SeasonDTO {

	private String seasonName;
	private String month;
	private String fruits;
	private String flowers;
	private boolean humidity;
	private float temperature;
	
	public SeasonDTO() {
		System.out.println("Invoked No-arg constructor");
	}

	public SeasonDTO(String seasonName, String month, String fruits, String flowers, boolean humidity,
			float temperature) {
		super();
		this.seasonName = seasonName;
		this.month = month;
		this.fruits = fruits;
		this.flowers = flowers;
		this.humidity = humidity;
		this.temperature = temperature;
	}

	public String getSeasonName() {
		return seasonName;
	}

	public void setSeasonName(String seasonName) {
		this.seasonName = seasonName;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getFruits() {
		return fruits;
	}

	public void setFruits(String fruits) {
		this.fruits = fruits;
	}

	public String getFlowers() {
		return flowers;
	}

	public void setFlowers(String flowers) {
		this.flowers = flowers;
	}

	public boolean isHumidity() {
		return humidity;
	}

	public void setHumidity(boolean humidity) {
		this.humidity = humidity;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	
	
	
}
