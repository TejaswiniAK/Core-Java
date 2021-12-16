package com.xworkz.functional;

import com.xworkz.functional.dao.CigaretteDAO;
import com.xworkz.functional.implemented.ElementEqual;
import com.xworkz.functional.implemented.EndsWith;
import com.xworkz.functional.implemented.EqualIgnoreCase;
import com.xworkz.functional.implemented.StartsWith;
import com.xworkz.functional.marker.Find;

public class CigaretteScammer {

	public static void main(String[] args) {
		
		CigaretteDAO cigaretteDAO = new CigaretteDAO();
		
		Find enter= new ElementEqual();
		
		boolean match = cigaretteDAO.find(enter, "Players");
		System.out.println(match);
		
		Find enter1 = new EndsWith();
		
		match = cigaretteDAO.find(enter1, "Scissors");
		System.out.println(match);
		
		Find enter2 = new EqualIgnoreCase();
		
		match = cigaretteDAO.find(enter2, "s");
		System.out.println(match);
		
		Find enter3 = new StartsWith();
	
		match = cigaretteDAO.find(enter3, "sci");
		System.out.println(match);
		
	}
}
