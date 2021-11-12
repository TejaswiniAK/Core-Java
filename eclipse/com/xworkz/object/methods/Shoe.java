package com.xworkz.object.methods;

public class Shoe {

	private String brand;
	private int size;
	private String color;
	private String gender;
	
	public Shoe(String brand, int size, String color, String gender) {
		super();
		this.brand = brand;
		this.size = size;
		this.color = color;
		this.gender = gender;
	}

	public String getBrand() {
		return brand;
	}

	public int getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}

	public String getGender() {
		return gender;
	}
	
	@Override
	public String toString() {
		System.out.println("Invoked toString() method from shoe class");
		return "qwtretuyeru";//super.toString();
	}
	
	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode() method from shoe class");
		return 767;//super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equal() method from shoe class");
		if(obj == null){
			System.err.println("Object pointing to null");
			return false;
		}
		if(obj instanceof Shoe){
			Shoe casted=(Shoe)obj;
			
			if(this.brand.equals(casted.getBrand()) && this.gender.equals(casted.getGender())){
				System.out.println("Matched");
				return true;
			}
			else{
				System.err.println("Not matched");
			}
		}
		return false;//super.equals(obj);
	}
}
