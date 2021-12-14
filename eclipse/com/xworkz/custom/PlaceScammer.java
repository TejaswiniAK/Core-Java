package com.xworkz.custom;

import com.xworkz.custom.dao.PlaceDAO;

public class PlaceScammer {

	public static void main(String[] args) {

		PlaceDAO placeDAO = new PlaceDAO();
		
		placeDAO.save("Bengalore");
		placeDAO.save("Hubli");
		placeDAO.save("Dharwad");
		placeDAO.save("Ooty");
		placeDAO.save("Manali");
		placeDAO.save("Jammu Kashmir");
		
		boolean match = placeDAO.findMatching("Ooty");
		System.out.println(match);
		
		match = placeDAO.findMatchingCaseInsensitive("ooty");
		System.out.println(match);
		
		boolean matchStarts = placeDAO.findMatchingStartsWithChars("jam");
		System.out.println(matchStarts);
		
		boolean matchEnds = placeDAO.findMatchingEndsWithChars("i");
		System.out.println(matchEnds);
		
	}

}
