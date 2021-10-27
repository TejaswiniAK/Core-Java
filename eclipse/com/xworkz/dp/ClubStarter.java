package com.xworkz.dp;

import com.xworkz.dp.dao.ClubDAO;
import com.xworkz.dp.dto.ClubDTO;

public class ClubStarter {

	public static void main(String[] args) {

		ClubDTO clubDTO=new ClubDTO(100, 80, 3.0f, 3000.0f, 110);
		ClubDTO clubDTO1=new ClubDTO(200, 60, 3.0f, 1000.0f, 110);
		ClubDTO clubDTO2=new ClubDTO(300, 50, 3.0f, 1300.0f, 110);
		ClubDTO clubDTO3=new ClubDTO(400, 80, 3.0f, 5000.0f, 110);
		ClubDTO clubDTO4=new ClubDTO(500, 40, 3.0f, 2000.0f, 110);
		
		ClubDAO clubDAO=new ClubDAO();
		
		clubDAO.save(clubDTO);
		clubDAO.save(clubDTO1);
		clubDAO.save(clubDTO2);
		clubDAO.save(clubDTO3);
		clubDAO.save(clubDTO4);
		
		clubDAO.delete(3);
		clubDAO.update(2, clubDTO4);
		
		ClubDTO[] dtos=clubDAO.getClubDTOs();
		dtos[0]=clubDTO;
		dtos[1]=clubDTO1;
		dtos[2]=clubDTO2;
		dtos[3]=clubDTO3;
		dtos[4]=clubDTO4;
		
		for(int i=0;i<dtos.length;i++) {
			ClubDTO ref=dtos[i];
			
			if(ref!=null) {
				System.out.println(ref.getEntryPrice());
				System.out.println(ref.getNoOfBottle());
				System.out.println(ref.getNoOfPeople());
				System.out.println(ref.getNoOfStaff());
				System.out.println("------------------------------------");
			}else {
				System.err.println("array is null");
			}
		}
		
	}

}
