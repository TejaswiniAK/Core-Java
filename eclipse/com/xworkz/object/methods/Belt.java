package com.xworkz.object.methods;

public class Belt {

	private float price;
	private String material;
	private int size;
	private char gender;

	public Belt(float price, String material, int size, char gender) {
		super();
		this.price = price;
		this.material = material;
		this.size = size;
		this.gender = gender;
	}

	public float getPrice() {
		return price;
	}

	public String getMaterial() {
		return material;
	}

	public int getSize() {
		return size;
	}

	public char getGender() {
		return gender;
	}

	@Override
	public String toString() {
		System.out.println("Invoked toString method from Belt class");
		return "aaaaaa";// super.toString();
	}
	
	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode method from Belt class");
		return 988;//super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equal method from Belt class");
		if(obj!=null){
			if(obj instanceof Belt){
				Belt casted= (Belt)obj;
				if(this.material.equals(casted.getMaterial())){
					System.out.println("Matched");
					return true;
				}else {
					System.err.println("not matched");
					return false;
				}
			}
		}
		return false;//super.equals(obj);
	}
}
