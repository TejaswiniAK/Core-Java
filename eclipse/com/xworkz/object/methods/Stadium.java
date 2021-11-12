package com.xworkz.object.methods;

public class Stadium {

	private String name;
	private String city;
	private int areaInMeter;

	public Stadium(String name, String city, int areaInMeter) {
		super();
		this.name = name;
		this.city = city;
		this.areaInMeter = areaInMeter;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public int getAreaInMeter() {
		return areaInMeter;
	}

	@Override
	public String toString() {
		System.out.println("Invoked toString method from Stadium class");
		return "nothing";// super.toString();
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode method from Stadium class");
		return 000;// super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equal method from Stadium class");
		if (obj == null) {
			System.out.println("obj is pointing to null");
			return false;
		}
		if (obj instanceof Stadium) {
			Stadium casted = (Stadium) obj;
			if (this.name.equals(casted.getName()) && this.city.equals(casted.getCity())) {
				System.out.println("Matched");
				return true;
			} else {
				System.err.println("not matched");
			}
		}
		return false;// super.equals(obj);
	}

}
