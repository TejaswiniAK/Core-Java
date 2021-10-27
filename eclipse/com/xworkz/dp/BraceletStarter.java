package com.xworkz.dp;

import com.xworkz.dp.dto.BraceletDTO;

public class BraceletStarter {

	public static void main(String[] args) {

		BraceletDTO bracelet = new BraceletDTO();

		bracelet.setColor("Gold");
		bracelet.setGemUsed(true);
		bracelet.setGifted(true);
		bracelet.setMaterial("Gold");
		bracelet.setPrice(2000.0f);

		BraceletDTO bracelet1 = new BraceletDTO(1500.0f, "silver", "silver", true, true);
		BraceletDTO bracelet2 = new BraceletDTO(50.0f, "red", "plastic", true, true);
		BraceletDTO bracelet3 = new BraceletDTO(50.0f, "pink", "plastic", true, true);
		BraceletDTO bracelet5 = new BraceletDTO(50.0f, "green", "plastic", true, true);

		BraceletDTO[] ref = new BraceletDTO[5];

		ref[0] = bracelet1;
		ref[1] = bracelet2;
		ref[2] = bracelet;
		ref[3] = bracelet3;
		ref[4] = bracelet5;

		for (int lock = 0; lock < ref.length; lock++) {
			BraceletDTO array = ref[lock];

			if (array != null) {
				System.out.println(array.getColor());
				System.out.println(array.getMaterial());
				System.out.println(array.getPrice());
				System.out.println(array.isGemUsed());
				System.out.println(array.isGifted());
				
				System.out.println();

			} else {
				System.err.println("Array is pointing to null...");
			}
		}
	}

}
