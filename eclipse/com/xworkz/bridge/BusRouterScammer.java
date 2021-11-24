package com.xworkz.bridge;

import com.xworkz.bridge.busroutedata.BusRouterAssociation;
import com.xworkz.bridge.busroutedata.dao.ArrayBusRouteDAO;
import com.xworkz.bridge.busroutedata.dao.BusRouteDAO;
import com.xworkz.bridge.busroutedata.dto.BusRouteDTO;

public class BusRouterScammer {

	public static void main(String[] args) {

		//dto
		BusRouteDTO busRouteDTO = new BusRouteDTO();
		busRouteDTO.setId("KA 01");
		busRouteDTO.setStartPoint("CBT");
		busRouteDTO.setDestination("Jayanagar");
		busRouteDTO.setDriverName("Lohit");
		
		System.out.println("-----------------------------------------------------------------");
		
		BusRouteDAO busRouteDAO=new ArrayBusRouteDAO();
		
		BusRouterAssociation association=new BusRouterAssociation();
		association.setDao(busRouteDAO);
		
		System.out.println("-----------------------------------------------------------------");
		
		association.saveData(busRouteDTO);
		
		System.out.println("-----------------------------------------------------------------");
		
		association.updateData(busRouteDTO);
		
		System.out.println("-----------------------------------------------------------------");
		
		association.updateDataAtIndex(busRouteDTO, 9);

		System.out.println("-----------------------------------------------------------------");
		
		association.updateDataAtIndex(busRouteDTO, 4);

		System.out.println("-----------------------------------------------------------------");
		
		association.deleteData(9);
		
		System.out.println("-----------------------------------------------------------------");

		association.deleteData(0);
		
		System.out.println("-----------------------------------------------------------------");

		association.displayAllDetails();
		
	}

}
