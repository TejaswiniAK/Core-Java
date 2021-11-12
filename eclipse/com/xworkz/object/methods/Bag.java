package com.xworkz.object.methods;

import com.xworkz.object.constants.BagColor;

public class Bag {

	private float price;
	private int sections;
	private BagColor bagColor;
	
	public Bag(float price, int sections, BagColor bagColor) {
		super();
		this.price = price;
		this.sections = sections;
		this.bagColor = bagColor;
	}

	public float getPrice() {
		return price;
	}

	public int getSections() {
		return sections;
	}

	public BagColor getBagColor() {
		return bagColor;
	}
	
	@Override
	public String toString() {
		System.out.println("Invoked toString() method ");
		return "executed";//super.toString();
	}
	
	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode() method ");
		return 222;//super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals() method ");
		if (obj == null) {
			System.err.println("Object pointing to null");
			return false;
		}
		
		if(obj instanceof Bag){
			System.out.println("Object is Bag type");
			Bag casted=(Bag)obj;
			
			BagColor bagColor=casted.getBagColor();
			System.out.println(bagColor);
			
			if(this.bagColor.equals(bagColor)){
				System.out.println("Bag Color is matched ");
				return true;
			}
			else {
				System.err.println("not matched");
			}
		}
		return false;//super.equals(obj);
	}
	
}
