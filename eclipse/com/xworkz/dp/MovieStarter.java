package com.xworkz.dp;

import com.xworkz.dp.dao.MovieDAO;
import com.xworkz.dp.dto.MovieDTO;

public class MovieStarter {

	public static void main(String[] args) {

		MovieDTO movieDTO=new MovieDTO("KGF", "neel", "yash", 5, "soubhagya");
		MovieDTO movieDTO1=new MovieDTO("Bahubali", "neel", "sudeep", 5, "soubhagya");
		MovieDTO movieDTO2=new MovieDTO("Pailwan", "neel", "darshan", 5, "soubhagya");
		MovieDTO movieDTO3=new MovieDTO("KGF", "neel", "shah rukh khan", 5, "soubhagya");
		MovieDTO movieDTO4=new MovieDTO("KGF", "neel", "siddharth malhotra", 5, "soubhagya");
		
		MovieDAO movieDAO=new MovieDAO();
		
		movieDAO.save(movieDTO);
		movieDAO.save(movieDTO1);
		movieDAO.save(movieDTO2);
		movieDAO.save(movieDTO3);
		movieDAO.save(movieDTO4);
		System.out.println();
		
		movieDAO.create(3, movieDTO);
		System.out.println();
		
		int indexOcupied=movieDAO.indexOccupied();
		System.out.println("index occupied are"+indexOcupied);
		System.out.println();
		
		boolean name=movieDAO.matching("siddharth malhotra");
        System.out.println(name);		
        
        
		
	}

}
