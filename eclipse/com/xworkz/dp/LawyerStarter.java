package com.xworkz.dp;

import com.xworkz.dp.constants.CourtType;
import com.xworkz.dp.dao.LawyerDAO;
import com.xworkz.dp.dto.LawyerDTO;

public class LawyerStarter {
	
	public static void main(String args[]){
		
		//dto
		LawyerDTO lawyerDTO1=new LawyerDTO("Tejaswini", "L.L.B", 10, 'F', 29, CourtType.DISTRICT_COURT, 8, 2);
		LawyerDTO lawyerDTO2=new LawyerDTO("Soubhagya", "L.L.B", 3, 'F', 22, CourtType.SUBORDINATE_COURTS, 3, 1);
		LawyerDTO lawyerDTO3=new LawyerDTO("Vinayak", "B.E", 0, 'M', 32, CourtType.NULL, 0, 0);
		LawyerDTO lawyerDTO4=new LawyerDTO("Sangita", "Diploma", 1, 'F', 23, CourtType.NULL, 1, 0);
		LawyerDTO lawyerDTO5=new LawyerDTO("Akshata", "B.E", 1, 'F', 25, CourtType.NULL, 2, 0);
		LawyerDTO lawyerDTO6=new LawyerDTO("Pavan", "L.L.B", 15, 'M', 39, CourtType.HIGH_COURT, 10, 0);
		LawyerDTO lawyerDTO7=new LawyerDTO("Rakesh", "L.L.B", 20, 'M', 62, CourtType.SUPREME_COURT, 12, 2);
		LawyerDTO lawyerDTO8=new LawyerDTO("Kavita", "B.E", 0, 'F', 29, CourtType.NULL, 4, 0);
		LawyerDTO lawyerDTO9=new LawyerDTO("Varsha", "Doctor", 0, 'F', 30, CourtType.NULL, 5, 0);
		LawyerDTO lawyerDTO10=new LawyerDTO("Parameshwar", "L.L.B", 30, 'M', 45, CourtType.SUPREME_COURT, 27, 1);
		
		//dao 
		
		LawyerDAO lawyerDAO=new LawyerDAO();
		
		lawyerDAO.save(lawyerDTO1);
		lawyerDAO.save(lawyerDTO2);
		lawyerDAO.save(lawyerDTO3);
		lawyerDAO.save(lawyerDTO4);
		lawyerDAO.save(lawyerDTO5);
		lawyerDAO.save(lawyerDTO6);
		lawyerDAO.save(lawyerDTO7);
		lawyerDAO.save(lawyerDTO8);
		lawyerDAO.save(lawyerDTO9);
		lawyerDAO.save(lawyerDTO10);
		
		//lawyerDAO.delete(4);
		
		//lawyerDAO.update(lawyerDTO9, 4);
		
		boolean show=lawyerDAO.searchByName(null);
		System.out.println(show);
		System.out.println();
	
	
		boolean show1=lawyerDAO.searchByName("lakshmi");
		System.out.println(show1);
		System.out.println();
	
		
		boolean showx=lawyerDAO.searchByName("Varsha");
		System.out.println(showx);
		System.out.println();
		
		// Akshata --> false
		// Varsha --> index : 4
		
		boolean x= lawyerDAO.searchByCasesWon(0);
		System.out.println(x);
		System.out.println();
		
		
		lawyerDAO.getLawyerWithExperience();
		
		lawyerDAO.getQualificationWithMaxExp("Kavita");
		
		lawyerDAO.getQualificationWithMaxExp("Nandini");
		
		lawyerDAO.getExpByName("Soubhagya");
		
		lawyerDAO.getExpByName(null);
		
		LawyerDTO[] dto=lawyerDAO.getDtos();
		
		dto[0]=lawyerDTO1;
		dto[1]=lawyerDTO2;
		dto[2]=lawyerDTO3;
		dto[3]=lawyerDTO4;
		dto[4]=lawyerDTO5;
		dto[5]=lawyerDTO6;
		dto[6]=lawyerDTO7;
		dto[7]=lawyerDTO8;
		dto[8]=lawyerDTO9;
		dto[9]=lawyerDTO10;
		
		for (int i = 0; i < dto.length; i++) {
			
			LawyerDTO ref=dto[i];
			
			if(ref!=null){
				System.out.println(ref.getName());
				System.out.println(ref.getQualification());
				System.out.println(ref.getExperience());
				System.out.println(ref.getGender());
				System.out.println(ref.getAge());
				System.out.println(ref.getCasesWon());
				System.out.println(ref.getCasesLost());
				System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			}
			else {
				System.out.println("Arry is Full");
			}
		}
		
	}

}
