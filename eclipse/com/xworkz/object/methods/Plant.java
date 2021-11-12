package com.xworkz.object.methods;

import com.xworkz.object.constants.PlantType;

public class Plant {

	private String name;
	private boolean alive;
	private int lifeSpan;
	private PlantType plantType;
	
	public Plant(String name, boolean alive, int lifeSpan, PlantType plantType) {
		super();
		this.name = name;
		this.alive = alive;
		this.lifeSpan = lifeSpan;
		this.plantType = plantType;
	}

	public String getName() {
		return name;
	}

	public boolean isAlive() {
		return alive;
	}

	public int getLifeSpan() {
		return lifeSpan;
	}

	public PlantType getPlantType() {
		return plantType;
	}
	
	@Override
	public String toString() {
		System.out.println("Invoked toString() method from Plant class");
		return "executed";
	}
	
	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode() method from Plant class");
		return 222; //super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equal() method from Plant class");
		if(obj==null){
			System.err.println("Object is pointing to null");
			return false;
		}
		if(obj instanceof Plant){
			System.out.println("obj is Plant type");
			Plant casted=(Plant)obj;
			
			String plantName=casted.getName();
			PlantType type=casted.getPlantType();
			
			if(this.name.equals(plantName) && this.plantType.equals(type)){
				System.out.println("Plant name and plant type are matched ");
				return true;
			}
			else {
				System.err.println("Not matched");
			}
		}
		return false;//super.equals(obj);
	}
	
}
