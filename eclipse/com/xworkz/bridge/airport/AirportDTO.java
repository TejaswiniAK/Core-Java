package com.xworkz.bridge.airport;

public class AirportDTO {

	private int id;
	private String name;
	private String location;
	private AirportType airportType;
	
	public AirportDTO(int id, String name, String location, AirportType airportType) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.airportType = airportType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public AirportType getAirportType() {
		return airportType;
	}

	public void setAirportType(AirportType airportType) {
		this.airportType = airportType;
	}
	
	
}
