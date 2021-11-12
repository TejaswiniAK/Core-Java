package com.xworkz.object.methods;

import com.xworkz.object.constants.FishType;

public class Fish {
	
	private String name;
	private FishType type;
	private float price;
	private String color;
	
	public Fish(String name, FishType type, float price, String color) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public FishType getType() {
		return type;
	}

	public float getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		System.out.println("Invoked toString() method from Fish class");
		return "Soubhiii";//super.toString();
	}
	
	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode method from Fish class");
		return 879;//super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equal method from fish");
		if(obj== null){
			System.err.println("obj is pointing to null");
			return false;
		}
		if(obj instanceof Fish){
			Fish casted =(Fish)obj;
			if(this.color.equals(casted.getColor()) && this.type.equals(casted.getType())){
				System.out.println("Matched");
				return true;
			}else{
				System.err.println("not matched");
			}
		}
		return false;// super.equals(obj);
	}

}
