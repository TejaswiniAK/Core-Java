package com.xworkz.dp.dto;

public class BucketDTO {

	private String color;
	private int size;
	private float price;
	private String quality;
	private float weight;
	private String company;
	
	public BucketDTO() {
		System.out.println("Invoke BucketDTO constructor");
	}

	public BucketDTO(String color, int size, float price, String quality, float weight, String company) {
		super();
		this.color = color;
		this.size = size;
		this.price = price;
		this.quality = quality;
		this.weight = weight;
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
	
}
