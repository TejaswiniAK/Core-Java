package com.xworkz.bridge.airport;

public class ImplimentationAirportDAO implements AirportDAO {

	AirportDTO[] dtos = new AirportDTO[10];
	int counter = 0;

	@Override
	public AirportDTO updateAtIndex(AirportDTO airportDTO, int atIndex) {
		System.out.println("Invoked over-ride updateAtIndex method");
		if (airportDTO != null && atIndex >= 0 && atIndex < dtos.length) {
			System.out.println("Checked airportDTO and atindex");
			this.dtos[atIndex] = airportDTO;
			System.out.println(airportDTO.getName());
			this.counter++;
		} else {
			System.err.println("Conditions are not correct");
		}
		return null;
	}

	@Override
	public void findByName(String name) {
		System.out.println("Invoked over-ride findByName method");
		if (name != null) {
			for (int j = 0; j < dtos.length; j++) {
				AirportDTO find = dtos[j];
				if (find != null) {
					String findName = dtos[j].getName();
					if (findName != null) {
						if (name.equals(findName)) {
							System.out.println("Name found ***");
						} else {
							System.err.println("Name not found");
						}
					}
				}
			}
		} else {
			System.err.println(" >>> enter name");
		}

	}

	@Override
	public void displayDetails() {
		System.out.println("Invoked over-ride displayDetails method");
		for (int i = 0; i < dtos.length; i++) {
			AirportDTO ref = dtos[i];
			if (ref != null) {
				System.out.println(dtos[i].getId());
				System.out.println(dtos[i].getName());
				System.out.println(dtos[i].getLocation());
				System.out.println(dtos[i].getAirportType());
			}
		}

	}

	public AirportDTO[] getDtos() {
		return dtos;
	}

}
