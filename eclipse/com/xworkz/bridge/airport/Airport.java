package com.xworkz.bridge.airport;

public class Airport {

	private AirportDAO dao;
	
	public Airport(AirportDAO dao) {
		super();
		this.dao = dao;
	}

	public void upadateData(AirportDTO airportDTO,int point){
		System.out.println("Ivnoked upadateData()");
		if(airportDTO!=null){
			dao.updateAtIndex(airportDTO, point);
		}else {
			System.err.println("airport pointing to null");
		}
	}
	
	public void findDataByName(String checkName){
		System.out.println("Invoked deleteData()");
		if(checkName!=null){
			dao.findByName(checkName);
		}else {
			System.err.println("checkName is Null");
		}
	}
	
	public void displayAllDetails(){
		System.out.println("Invoked displayAllDetails()");
		dao.displayDetails();
	}
}
