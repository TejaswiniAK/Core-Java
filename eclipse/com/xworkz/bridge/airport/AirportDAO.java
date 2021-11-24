package com.xworkz.bridge.airport;

public interface AirportDAO {

	AirportDTO updateAtIndex(AirportDTO airportDTO, int atIndex);

	void findByName(String name);

	void displayDetails();

}