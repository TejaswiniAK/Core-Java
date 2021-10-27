package com.xworkz.dp;

import com.xworkz.dp.dto.BusDriverDTO;

public class BusDriverStarter {

	public static void main(String[] args) {

		BusDriverDTO busDriverDTO=new BusDriverDTO();
		
		busDriverDTO.setBusName("VRL");
		busDriverDTO.setAge(45);
		busDriverDTO.setDriverName("Ramesh");
		busDriverDTO.setExperience(25);
		busDriverDTO.setSalary(25000);
		busDriverDTO.setPlace("Benglore");
		busDriverDTO.setGovernment(false);
		
		BusDriverDTO busDriverDTO2=new BusDriverDTO("Karthik", 30, 8, "KSRTC", "Dharwad", 30000, true);
		BusDriverDTO busDriverDTO3=new BusDriverDTO("Lakshmi", 32, 10, "Rajkumar", "Hubli", 28000, false);
		BusDriverDTO busDriverDTO4=new BusDriverDTO("Raghu", 40, 20, "Rajkumar", "Udupi", 30000, false);
		BusDriverDTO busDriverDTO5=new BusDriverDTO("Rakesh", 40, 28, "BMTC", "Benglore", 40000, true);
	
		BusDriverDTO ref[]=new BusDriverDTO[7];
		
		ref[0]=busDriverDTO;
		ref[1]=busDriverDTO;
		ref[2]=busDriverDTO2;
		ref[3]=busDriverDTO3;
		ref[4]=busDriverDTO5;
		
		for (int i = 0; i < ref.length; i++) {
			BusDriverDTO array=ref[i];
			
			System.out.println(array.getDriverName());
			System.out.println(array.getDriverName());
			System.out.println(array.getDriverName());
			System.out.println(array.getDriverName());
			System.out.println(array.getDriverName());
			System.out.println(array.getDriverName());
		}
	
	}

}
