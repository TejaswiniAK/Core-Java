package com.xworkz.dp;

import com.xworkz.dp.dto.CraneDTO;

public class CraneStarter {

	public static void main(String[] args) {

		CraneDTO craneDTO = new CraneDTO();

		craneDTO.setName("Sandhill crane");
		craneDTO.setColor("mostly grayish feathers");
		craneDTO.setTall("4.4-5 feet tall");
		craneDTO.setType("Cuban Sandhill Crane");
		craneDTO.setBabies(true);
		craneDTO.setForest("northeast siberia");
		craneDTO.setWeigth(5.2f);

		CraneDTO craneDTO2 = new CraneDTO("Sarus crane", "100-130cm", 5.9f, "grey", "northern and central India", true,
				"Indian Sarus");
		CraneDTO craneDTO3 = new CraneDTO("Whooping crane", "1.5 meters", 8.5f, "bright white", "aspen parkland", true,
				"North America");
		CraneDTO craneDTO4 = new CraneDTO("Red-crowned crane", "158 centimeters", 8.8f, "snow-white primary feathers",
				"Manchurian crane or Japanese crane", true, "Grus");
		CraneDTO craneDTO5 = new CraneDTO("Blue crane", "100 – 120 cm", 6.2f, "pale blue-grey", "southern Africa", true,
				"wattled cranes");

		CraneDTO[] ref = new CraneDTO[5];

		ref[0] = craneDTO;
		ref[1] = craneDTO2;
		ref[2] = craneDTO3;
		ref[3] = craneDTO4;
		ref[4] = craneDTO5;

		for (int i = 0; i < ref.length; i++) {
			CraneDTO array = ref[i];

			if (array != null) {
				// System.out.println(array[i]); --> address
				System.out.println(array.getName());
				System.out.println(array.getTall());
				System.out.println(array.getColor());
				System.out.println(array.getForest());
				System.out.println(array.getType());
				System.out.println(array.getWeigth());
				System.out.println(array.isBabies());
				System.out.println();
			}
			else{
				System.err.println("Array is pointing to null... ");
			}
		}

	}

}
