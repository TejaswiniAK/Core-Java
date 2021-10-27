package com.xworkz.dp.dto;

public class MovieDTO {

	private String name;
	private String director;
	private String actor;
	private float rating;
	private String producer;
	
	public MovieDTO() {
		System.out.println("Invoke MovieDTO constructor");
	}

	public MovieDTO(String name, String director, String actor, float rating, String producer) {
		super();
		this.name = name;
		this.director = director;
		this.actor = actor;
		this.rating = rating;
		this.producer = producer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	
}
