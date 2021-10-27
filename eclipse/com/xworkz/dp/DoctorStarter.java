package com.xworkz.dp;

import com.xworkz.dp.dao.DoctorDAO;
import com.xworkz.dp.dto.DoctorDTO;

public class DoctorStarter {

	public static void main(String[] args) {

		DoctorDTO doctorDTo=new DoctorDTO("Ramesh", "MBBS", "Kantirava", "male", 50000.0d, 40);
		DoctorDTO doctorDTo1=new DoctorDTO("Ramesh", "MBBS", "Kantirava", "male", 50000.0d, 40);
		DoctorDTO doctorDTo2=new DoctorDTO("Rakesh", "MBBS", "Nimans", "male", 50000.0d, 40);
		DoctorDTO doctorDTo3=new DoctorDTO("Ramesh", "MBBS", "Kantirava", "male", 50000.0d, 40);
		DoctorDTO doctorDTo4=new DoctorDTO("Ramesh", "MBBS", "Kantirava", "male", 50000.0d, 40);
		
		DoctorDAO doctorDAO=new DoctorDAO();
		
		doctorDAO.save(doctorDTo);
		doctorDAO.save(doctorDTo1);
		doctorDAO.save(doctorDTo2);
		doctorDAO.save(doctorDTo3);
		doctorDAO.save(doctorDTo4);
		System.out.println();
		
		doctorDAO.create(3, doctorDTo);
		System.out.println();
		
		int indexOccupied=doctorDAO.indexOccupied();
		System.out.println("index occupied are"+indexOccupied);
		System.out.println();
		
		boolean name=doctorDAO.matching("Nimans");
		System.out.println(name);
		
	}

}
