package com.xworkz.dp.dto;

public class ClubDTO {

	private int noOfPeople;
	private int noOfBottle;
	private float rating;
	private float entryPrice;
	private int noOfStaff;
	
	public ClubDTO() {
		System.out.println("Invoke ClubDTO constructor");
	}

	public ClubDTO(int noOfPeople, int noOfBottle, float rating, float entryPrice, int noOfStaff) {
		super();
		this.noOfPeople = noOfPeople;
		this.noOfBottle = noOfBottle;
		this.rating = rating;
		this.entryPrice = entryPrice;
		this.noOfStaff = noOfStaff;
	}

	public int getNoOfPeople() {
		return noOfPeople;
	}

	public void setNoOfPeople(int noOfPeople) {
		this.noOfPeople = noOfPeople;
	}

	public int getNoOfBottle() {
		return noOfBottle;
	}

	public void setNoOfBottle(int noOfBottle) {
		this.noOfBottle = noOfBottle;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public float getEntryPrice() {
		return entryPrice;
	}

	public void setEntryPrice(float entryPrice) {
		this.entryPrice = entryPrice;
	}

	public int getNoOfStaff() {
		return noOfStaff;
	}

	public void setNoOfStaff(int noOfStaff) {
		this.noOfStaff = noOfStaff;
	}
	
	
}
