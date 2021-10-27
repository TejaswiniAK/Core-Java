package com.xworkz.dp;

import com.xworkz.dp.dao.CircusDAO;
import com.xworkz.dp.dto.CircusDTO;

public class CircusStarter {

	public static void main(String[] args) {

		//dto
		CircusDTO circusDTO=new CircusDTO("Laxman", 200.0F, 40, 5, "6 to 10");
		CircusDTO circusDTO2=new CircusDTO("Rohit", 100.0F, 20, 4, "1 to 6");
		CircusDTO circusDTO3=new CircusDTO("Nagappa", 400.0f, 55, 9, "9 to 10");
		
		//dao
		CircusDAO circusDAO=new CircusDAO();
		
		CircusDTO[] ref=circusDAO.getDtos();
		
		ref[0]=circusDTO;
		ref[1]=circusDTO2;
		ref[2]=circusDTO3;
		
		circusDAO.create(circusDTO3);
		
		circusDAO.create(circusDTO, 0);
		
		circusDAO.indexOccupied();
		
		circusDAO.matchOwner("Rohit");
		
		for (int i = 0; i < ref.length; i++) {
			CircusDTO array=ref[i];
			if(array!=null){
				System.out.println(array.getOwner());
				System.out.println(array.getDuration());
				System.out.println(array.getNoOfAnimals());
				System.out.println(array.getTicketPrice());
				System.out.println("@@@@@@@@@@   @@@@@   @@@@@@@@@@");
			}
			else {
				System.out.println("Array is full");
			}
			System.out.println();
		}
		
		
	}

}
