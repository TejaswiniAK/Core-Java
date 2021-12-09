package com.xworkz.heirarchy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import com.xworkz.heirarchy.dto.PoliceStationDTO;

public class PoliceStationScammer {

	public static void main(String[] args) {

		PoliceStationDTO policeStationDTO1 = new PoliceStationDTO("Mico Layout Police Station", "Civil", "Mico Layout", 18);
		
		PoliceStationDTO policeStationDTO2 =new PoliceStationDTO("Banasawadi Police Station", "Civil", "Kalyan Nagar, Bengaluru", 20);
		
		PoliceStationDTO policeStationDTO3 =new PoliceStationDTO("Bharathi Nagar Police Station", "Civil", "Frazer Town", 30);
		
		PoliceStationDTO policeStationDTO4 =new PoliceStationDTO("Byappanahalli Police Station", "Civil", "Bennigana Halli", 45);
		
		PoliceStationDTO policeStationDTO5 = new PoliceStationDTO("Mico Layout Police Station", "Civil", "Mico Layout", 18);
		
		Set<PoliceStationDTO> collection = new HashSet<PoliceStationDTO>();
		
		collection.add(policeStationDTO4);
		collection.add(policeStationDTO3);
		collection.add(policeStationDTO5);
		collection.add(policeStationDTO2);
		collection.add(policeStationDTO1);
		collection.add(policeStationDTO1);
		
		
		Iterator<PoliceStationDTO> itr =collection.iterator() ;
		
		collection.hashCode();
		
		while (itr.hasNext()) {
			PoliceStationDTO point = itr.next();
			System.out.println(point);
			
		}
		System.out.println(collection.size());
		
		//System.out.println(itr.equals(policeStationDTO5));
	}

}
