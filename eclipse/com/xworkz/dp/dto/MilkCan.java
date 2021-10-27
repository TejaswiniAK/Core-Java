package com.xworkz.dp.dto;

public class MilkCan {

	private int quantity;
	private String shape;
	private String quality;
	private String color;
	private float price;
	
	public MilkCan() {
		System.out.println("Invoke MilkCan Constructor");
	}

	public MilkCan(int quantity, String shape, String quality, String color, float price) {
		super();
		this.quantity = quantity;
		this.shape = shape;
		this.quality = quality;
		this.color = color;
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
