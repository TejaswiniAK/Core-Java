package com.xworkz.heirarchy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.heirarchy.dto.ChocolateDTO;

public class ChocolateScammer {

	public static void main(String[] args) {
		
		ChocolateDTO chocolateDTO =new ChocolateDTO("Dairy Milk", "Cadbury", 100);
		ChocolateDTO chocolateDTO2 = new ChocolateDTO("5 Star", "Cadbury", 25);
		ChocolateDTO chocolateDTO3 = new ChocolateDTO("MilkyBar", "Nestle", 20);
		ChocolateDTO chocolateDTO4 = new ChocolateDTO("KitKat", "Nestle", 20);
		ChocolateDTO chocolateDTO5 = new ChocolateDTO("Amul Chocozoo", "Amul", 80);
		
		Set<ChocolateDTO> refSet = new HashSet<ChocolateDTO>();
		
		refSet.add(chocolateDTO5);
		refSet.add(chocolateDTO4);
		refSet.add(chocolateDTO3);
		refSet.add(chocolateDTO2);
		refSet.add(chocolateDTO4);
		refSet.add(chocolateDTO);
		refSet.add(chocolateDTO);
		
		Iterator<ChocolateDTO> itrSet = refSet.iterator();
		
		while (itrSet.hasNext()) {
			ChocolateDTO pointing =  itrSet.next();
			System.out.println(pointing);
		}

	}

}
