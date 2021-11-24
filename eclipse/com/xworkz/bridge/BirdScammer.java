package com.xworkz.bridge;

import com.xworkz.bridge.bird.BirdAssociation;
import com.xworkz.bridge.bird.dao.BirdDAO;
import com.xworkz.bridge.bird.dao.BirdDAOImplimentation;
import com.xworkz.bridge.bird.dto.BirdDTO;

public class BirdScammer {

	public static void main(String[] args) {

		BirdDTO birdDTO=new BirdDTO("Amazon Parrots", true, 3, "South America", true);
		BirdDTO birdDTO2=new BirdDTO("Australian King Parrot", true, 3, "Australia", true);
		
		BirdDAO birdDAO=new BirdDAOImplimentation();
		
		BirdAssociation association=new BirdAssociation(birdDAO);
		System.out.println("----------------------------------------------------------------------");
		association.saveData(birdDTO);
		System.out.println("----------------------------------------------------------------------");
		association.saveData(birdDTO2);
		System.out.println("----------------------------------------------------------------------");
		association.displayAllData();
		System.out.println("----------------------------------------------------------------------");
		association.deleteData(1);

	
	}

}
