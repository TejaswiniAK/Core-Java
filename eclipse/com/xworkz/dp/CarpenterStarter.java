package com.xworkz.dp;

import com.xworkz.dp.dto.CarpenterDTO;

public class CarpenterStarter {

	public static void main(String[] args) {

		CarpenterDTO carpenterDTO = new CarpenterDTO();
		carpenterDTO.setCarpenterName("Akash");
		carpenterDTO.setAge(30);
		carpenterDTO.setExperience(10);
		carpenterDTO.setPlace("Benglore");
		carpenterDTO.setSalary(15000d);
		carpenterDTO.setWork("Site ");
		carpenterDTO.setWorkingHours("10:00 am to 5:00pm");

		CarpenterDTO carpenterDTO2 = new CarpenterDTO("Laxman", 8, 10000, "Apartment", 28, "Hasan",
				"09:00 am to 05:00 pm");
		CarpenterDTO carpenterDTO3 = new CarpenterDTO("Kiran", 6, 6000d, "Home", 29, "Haveri", "12:00 pm to 8:00 pm");
		CarpenterDTO carpenterDTO4=new CarpenterDTO("Varsha", 17, 28000d, "Tailer", 24, "Hubli", "08:00 am to 8:00pm");
		CarpenterDTO carpenterDTO5=new CarpenterDTO("Soubhagya", 0, 3000, "Cement", 22, "Gadag", "9:00 am to 5:00 pm");
		
		CarpenterDTO[] ref=new CarpenterDTO[7];
		
		ref[0]=carpenterDTO;
		ref[1]=carpenterDTO2;
		ref[2]=carpenterDTO3;
		ref[3]=carpenterDTO4;
		ref[4]=carpenterDTO5;
		
		for (int i = 0; i < ref.length; i++) {
			CarpenterDTO array= ref[i];
			if(array!=null){
				System.out.println(array.getCarpenterName());
				System.out.println(array.getAge());
				System.out.println(array.getPlace());
				System.out.println(array.getExperience());
				System.out.println(array.getSalary());
				System.out.println(array.getWork());
				System.out.println(array.getWorkingHours());
				
				System.out.println();
			}
			else{
				System.err.println("Array is pointing Null");
			}
		}

	}

}
