package com.xworkz.dp;

import com.xworkz.dp.dto.ParkDTO;

public class ParkStarter {

	public static void main(String[] args) {

		ParkDTO parkDTO=new ParkDTO();
		
		parkDTO.setGymInstupents(false);
		parkDTO.setHoliday("Monday");
		parkDTO.setLocation("Benglore");
		parkDTO.setNoOfBenches(20);
		parkDTO.setParkName("Kuvempu");
		parkDTO.setTemple(false);
		parkDTO.setTimings("05:30am to 10:00am");
		
		ParkDTO parkDTO2=new ParkDTO("KC Park","Dharwad","08:00am to 09:00pm",30,"Friday",false,false);
		ParkDTO parkDTO3=new ParkDTO("BBMP", "BTM", "09:00 to 5:00pm", 18, "tueday", false, false);
		ParkDTO parkDTO4=new ParkDTO("BTM Park", "Benglore", "4:00pm to 7:00pm", 29, "friday", false, false);
		
		ParkDTO[] ref=new ParkDTO[5];
		
		ref[0]=parkDTO;
		ref[1]=parkDTO2;
		ref[2]=parkDTO4;
		ref[3]=parkDTO3;
		ref[4]=parkDTO4;
		
		for (int i = 0; i < ref.length; i++) {
			ParkDTO array=ref[i];
			
			if (array != null){

				System.out.println(array.getHoliday());
				System.out.println(array.getLocation());
				System.out.println(array.getNoOfBenches());
				System.out.println(array.getParkName());
				System.out.println(array.getTimings());
				System.out.println(array.isGymInstupents());
				System.out.println(array.isTemple());
				
				System.out.println();
				
			}
		}
		
		
	}

}
