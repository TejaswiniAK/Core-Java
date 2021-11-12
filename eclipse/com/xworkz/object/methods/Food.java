package com.xworkz.object.methods;

public class Food {

	private String name;
	private float price;
	private int quantity;
	private String quality;
	
	public Food(String name, float price, int quantity, String quality) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.quality = quality;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getQuality() {
		return quality;
	}
	
	@Override
	public String toString() {
		System.out.println("Invoked toString methof from Food");
		return "Anna Samber";// super.toString();
	}
	
	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode method from food class");
		return 987;// super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equal method from food class");
		if(obj ==null){
			System.err.println("obj is pointing to null");
			return false;
		}
		if(obj instanceof Food){
			Food casted = (Food)obj;
			if(this.name.equals(casted.getName()) && this.quality.equals(casted.getQuality())){
				System.out.println("matched");
				return true;
			}else{
				System.err.println("not matched");
			}
		}
		return false;//super.equals(obj);
	}
	
}
