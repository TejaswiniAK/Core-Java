package com.xworkz.object.methods;

import com.xworkz.object.constants.HeadsetType;

public class Headset {

	private String brand;
	private boolean battery;
	private int warranty;
	private HeadsetType headsetType;

	public Headset(String brand, boolean battery, int warranty, HeadsetType headsetType) {
		super();
		this.brand = brand;
		this.battery = battery;
		this.warranty = warranty;
		this.headsetType = headsetType;
	}

	public String getBrand() {
		return brand;
	}

	public boolean isBattery() {
		return battery;
	}

	public int getWarranty() {
		return warranty;
	}

	public HeadsetType getHeadsetType() {
		return headsetType;
	}

	@Override
	public String toString() {
		System.out.println("Invoked toString() method ");
		return "executed";// super.toString();
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode() method ");
		return 222;// super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals() method ");
		if (obj == null) {
			System.err.println("Object pointing to null");
			return false;
		}

		if (obj instanceof Headset) {
			System.out.println("");
			Headset casted = (Headset) obj;

			String checkBrand = casted.getBrand();
			HeadsetType checkHeadSet = casted.getHeadsetType();
			System.out.println("Battery is on : " + checkBrand + " and " + " Warranty is : " + checkHeadSet);

			if (this.brand.equals(checkBrand) && this.headsetType.equals(checkHeadSet)) {
				System.out.println("Matched");
				return true;
			} else {
				System.err.println("Not matched");
			}
		}

		return false;// super.equals(obj);
	}

}
