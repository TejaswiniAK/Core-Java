package com.xworkz.dp.dto;

public class DressCodeDTO {
// size,material,color,price,gender
	
	// Properties must be private
	private int size;
	private String material;
	private String color;
	private float price;
	private char gender;
	
	// create no-argument constructor
	public DressCodeDTO() {
		System.out.println("DressCode no-arg constructor ");
		System.out.println();
	}

	public DressCodeDTO(int size, String material, String color, float price, char gender) {
		super();
		this.size = size;
		this.material = material;
		this.color = color;
		this.price = price;
		this.gender = gender;
	}

	//To access propeties we should use getter and setter methods
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}
