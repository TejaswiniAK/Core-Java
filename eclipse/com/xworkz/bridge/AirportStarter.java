package com.xworkz.bridge;

import com.xworkz.bridge.airport.Airport;
import com.xworkz.bridge.airport.AirportDAO;
import com.xworkz.bridge.airport.AirportDTO;
import com.xworkz.bridge.airport.AirportType;
import com.xworkz.bridge.airport.ImplimentationAirportDAO;

public class AirportStarter {

	public static void main(String[] args) {
		
		AirportDTO airportDTO=new AirportDTO(1, "Rajiv Gandhi", "Hyderabad,Telangana", AirportType.INTER_NATIONAL_AIRPORTS);
		
		AirportDAO airportDAO=new ImplimentationAirportDAO();
		
		Airport airport=new Airport(airportDAO);
		
		airport.upadateData(airportDTO, 3);
		System.out.println("-------------------------------------------");
		airport.findDataByName("xyz");
		System.out.println("-------------------------------------------");
		airport.findDataByName("Rajiv Gandhi");
		System.out.println("-------------------------------------------");
		airport.displayAllDetails();

	}
}
