package com.xworkz.bridge.busroutedata;

import com.xworkz.bridge.busroutedata.dao.BusRouteDAO;
import com.xworkz.bridge.busroutedata.dto.BusRouteDTO;

public class BusRouterAssociation {

	private BusRouteDAO dao;

	public void setDao(BusRouteDAO dao) {
		this.dao = dao;
	}

	public void saveData(BusRouteDTO routeDTO) {
		System.out.println("Invoked saveData()");
		if (routeDTO != null) {
			System.out.println("calling save...");
			dao.save(routeDTO);
		} else {
			System.err.println("routerDTO is null");
		}
	}

	public void updateData(BusRouteDTO busRouteDTO) {
		System.out.println("Invoked updateData()");
		if (busRouteDTO != null) {
			System.out.println("calling update...");
			dao.update(busRouteDTO);
		} else {
			System.err.println("routerDTO is null");
		}
	}

	public void updateDataAtIndex(BusRouteDTO routeDTO, int atIndex) {
		System.out.println("Invoked updateDataAtIndex()");
		if (routeDTO != null) {
			System.out.println("calling update Data At Index...");
			dao.update(routeDTO, atIndex);
		} else {
			System.err.println("routerDTO is null");
		}
	}
	
	public void deleteData(int atDelete){
		System.out.println("Invoked delete()");
			dao.delete(atDelete);
		
	}

	public void displayAllDetails() {
		System.out.println("Invoked displayAllDetails()");
		dao.displayDetails();
	}
}
