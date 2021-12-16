package com.xworkz.functional;

import com.xworkz.functional.dao.BiscuitDAO;
import com.xworkz.functional.implemented.ElementEqual;
import com.xworkz.functional.implemented.ElementSearch;
import com.xworkz.functional.implemented.EndsWith;
import com.xworkz.functional.implemented.EqualIgnoreCase;
import com.xworkz.functional.implemented.StartsWith;
import com.xworkz.functional.marker.Find;

public class BiscuitsScammer {

	public static void main(String[] args) {

		BiscuitDAO biscuitDAO = new BiscuitDAO();
		
		//Association
		
		//1.
		Find enter = new ElementSearch();
		
		boolean present = biscuitDAO.find(enter, "Oreo");
		System.out.println(present);
		
		boolean present1 = biscuitDAO.find(enter, "Oreoo");
		System.out.println(present1);
		
		//2. 
		Find equalsOrNot =new ElementEqual();
		
		boolean match = biscuitDAO.find(equalsOrNot, "Good Day");
		System.out.println(match);
		
		match = biscuitDAO.find(equalsOrNot, "Goodd Day");
		System.out.println(match);
		
		//4.
		Find enter1 = new EqualIgnoreCase();
		
		match = biscuitDAO.find(enter1, "good day");
		System.out.println(match);
		
		
		//3.
		Find enterStart =new StartsWith();
		
		boolean match3 = biscuitDAO.find(enterStart, "Goo");
		System.out.println(match3);
		
		//4.
		Find enterEnds =new EndsWith();
		
		boolean match4 = biscuitDAO.find(enterEnds, "ay");
		System.out.println(match4);
	}

}
