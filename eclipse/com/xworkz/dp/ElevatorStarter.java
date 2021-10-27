package com.xworkz.dp;

import com.xworkz.dp.dto.ElevatorDTO;

public class ElevatorStarter {

	public static void main(String[] args) {

		ElevatorDTO dto = new ElevatorDTO();

		dto.setCardAccess(false);
		dto.setDoorRestraints(false);
		dto.setDoorSenores(false);
		dto.setElevatorButtons(12);
		dto.setElevatorFor("Aged People");
		dto.setElevatorType("Old people");
		dto.setSafetyBrackes(false);

		ElevatorDTO dto2 = new ElevatorDTO(true, 15, true, true, true, "All", "All");
		ElevatorDTO dto3 = new ElevatorDTO(true, 20, true, false, true, "Electrical", "Managers");
		ElevatorDTO dto4 = new ElevatorDTO(true, 23, true, true, true, "Current", "Patients");
		ElevatorDTO dto5 = new ElevatorDTO(false, 16, true, true, true, "electrical", "Doctores");

		ElevatorDTO[] ref = new ElevatorDTO[6];

		ref[0] = dto;
		ref[1] = dto2;
		ref[2] = dto3;
		ref[3] = dto4;
		ref[4] = dto5;

		for (int i = 0; i < ref.length; i++) {

			ElevatorDTO array = ref[i];

			if (array != null) {
				System.out.println(array.isCardAccess());
				System.out.println(array.isDoorRestraints());
				System.out.println(array.isDoorSenores());
				System.out.println(array.isSafetyBrackes());
				System.out.println(array.getElevatorButtons());
				System.out.println(array.getElevatorFor());
				System.out.println(array.getElevatorType());
				
				System.out.println();
			}
			else {
				System.err.println("Array is pointing to null...");
			}
		}

	}

}
