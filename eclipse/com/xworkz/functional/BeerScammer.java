package com.xworkz.functional;

import com.xworkz.functional.dao.BeerDAO;
import com.xworkz.functional.implemented.ElementEqual;
import com.xworkz.functional.implemented.EndsWith;
import com.xworkz.functional.implemented.EqualIgnoreCase;
import com.xworkz.functional.implemented.StartsWith;
import com.xworkz.functional.marker.Find;

public class BeerScammer {

	public static void main(String[] args) {

		BeerDAO beerDAO = new BeerDAO();

		Find enter = new ElementEqual();

		boolean match = beerDAO.find(enter, "Beer6");
		System.out.println(match);

		Find enter1 = new EndsWith();

		match = beerDAO.find(enter1, "Beer6");
		System.out.println(match);

		Find enter2 = new EqualIgnoreCase();

		match = beerDAO.find(enter2, "7");
		System.out.println(match);

		Find enter3 = new StartsWith();

		match = beerDAO.find(enter3, "B");
		System.out.println(match);

	}

}
