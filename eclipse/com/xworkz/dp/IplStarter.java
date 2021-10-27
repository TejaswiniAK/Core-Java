package com.xworkz.dp;

import com.xworkz.dp.dao.IplDAO;
import com.xworkz.dp.dto.IplDTO;

public class IplStarter {

	public static void main(String[] args) {

		//dto
		IplDTO iplDTO=new IplDTO("RCB", 24, "United Spirits Limited", "Puma");
		IplDTO iplDTO2=new IplDTO("MI", 24, "Mukesh Ambani", "Samsung");
		IplDTO iplDTO3=new IplDTO("KKR", 24, "Shah Rukha Khan", "Red Chillies Entertainment");
		
		//dao
		IplDAO iplDAO=new IplDAO();
		
		IplDTO[] ref=iplDAO.getDtos();
		
		ref[0]=iplDTO;
		ref[1]=iplDTO2;
		ref[2]=iplDTO3;
		ref[4]=iplDTO;
		
		iplDAO.delete(4);
		iplDAO.create(iplDTO);
		iplDAO.create(iplDTO2, 5);
		iplDAO.updateTeam(iplDTO3, 9);
		
		int hello=iplDAO.indexOccupied();
		System.out.println("Index occupied : ".concat(String.valueOf(hello)));;
		System.out.println();
		
		boolean correct=iplDAO.matchOwner("Shah Rukha Khan");
		System.out.println("Owner name : ".concat(String.valueOf(correct)));
		System.out.println();
		
		for (int i = 0; i < ref.length; i++) {
			IplDTO array=ref[i];
			
			if(array!=null){
				System.out.println(array.getTeamName());
				System.out.println(array.getSponsor());
				System.out.println(array.getOwner());
				System.out.println(array.getTeamSize());
			}
			else{
				System.out.println("Array is full");
			}
			System.out.println("============================================");
		}
		
/*		boolean correct=iplDAO.matchOwner("Shah Rukha Khan");
		System.out.println("Owner name : ".concat(String.valueOf(correct)));
		System.out.println();
*/		
		
		
		
	}

}
