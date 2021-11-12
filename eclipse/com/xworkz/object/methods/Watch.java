package com.xworkz.object.methods;

import com.xworkz.object.constants.WatchType;

public class Watch {

	private String brand;
	private float price;
	private WatchType watchType;

	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public WatchType getWatchType() {
		return watchType;
	}

	public void setWatchType(WatchType watchType) {
		this.watchType = watchType;
	}

	@Override
	public String toString() {
		System.out.println("Invoked toString() method from Watch");
		return "*  Executed toString()";// super.toString();
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode() method from Watch");
		return 111;// super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals() method from Watch");

		if (obj == null) {
			System.err.println("You not entered Watch type");
			return false;
		}

		if (obj instanceof Watch) {
			System.out.println("Entered type is correct");
			Watch check = (Watch) obj;

			String isBrand = check.getBrand();
			System.out.println("Brand : "+isBrand);

			if (this.brand.equals(isBrand)) {
				System.out.println("Brands are matched ");
			} else {
				System.err.println("Brands are not matched");
			}
			
			WatchType type=check.getWatchType();
			System.out.println("Watch Type : "+type);
			
			if(this.watchType.equals(type)){
				System.out.println("Watch Types are matched");
			}
			else {
				System.err.println("Watch Types are not matched");
			}
		}
		return false;// super.equals(obj);
	}

}
