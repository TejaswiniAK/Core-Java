package com.xworkz.dp.dto;

public class CraneDTO {

	private String name;
	private String tall;
	private float weigth;
	private String color;
	private String forest;
	private boolean babies;
	private String type;
	
	public CraneDTO(){
		System.out.println("No-argument Constructor ");
	}

	public CraneDTO(String name, String tall, float weigth, String color, String forest, boolean babies, String type) {
		super();
		this.name = name;
		this.tall = tall;
		this.weigth = weigth;
		this.color = color;
		this.forest = forest;
		this.babies = babies;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTall() {
		return tall;
	}

	public void setTall(String tall) {
		this.tall = tall;
	}

	public float getWeigth() {
		return weigth;
	}

	public void setWeigth(float weigth) {
		this.weigth = weigth;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getForest() {
		return forest;
	}

	public void setForest(String forest) {
		this.forest = forest;
	}

	public boolean isBabies() {
		return babies;
	}

	public void setBabies(boolean babies) {
		this.babies = babies;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
