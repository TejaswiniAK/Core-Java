package com.xworkz.bridge.amazon.dto;

public class CartDTO {

	private String name;
	private int quantity;
	private double price;
	private int items;
	

	public CartDTO(String name, int quantity, double price, int items) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.items = items;
		
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	public int getItems() {
		return items;
	}


	
}
