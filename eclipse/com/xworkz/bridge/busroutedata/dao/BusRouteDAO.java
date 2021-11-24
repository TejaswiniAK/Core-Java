package com.xworkz.bridge.busroutedata.dao;

import com.xworkz.bridge.busroutedata.dto.BusRouteDTO;

public interface BusRouteDAO {

	void save(BusRouteDTO busRouteDTO);

	void update(BusRouteDTO busRouteDTO);
	
	void update(BusRouteDTO busRouteDTO,int index);

	int delete(int index);

	String findByID(BusRouteDTO busRouteDTO);

	void displayDetails();
}
