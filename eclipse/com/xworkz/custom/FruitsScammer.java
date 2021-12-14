package com.xworkz.custom;

import com.xworkz.custom.dao.FruitsDAO;

public class FruitsScammer {

	public static void main(String[] args) {

		
		FruitsDAO fruitsDAOs = new FruitsDAO();
		
		fruitsDAOs.save("Apple");
		fruitsDAOs.save("Graps");
		fruitsDAOs.save("Citrus");
		fruitsDAOs.save("strawberries");
		fruitsDAOs.save("rockmelons ");
		
		boolean match = fruitsDAOs.findMatching("rockmelons ");
		System.out.println(match);
		
		match =fruitsDAOs.findMatchingCaseInsensitive("graps");
		System.out.println(match);
		
		match = fruitsDAOs.findMatchingStartsWithChars("S");
		System.out.println(match);
		
		match = fruitsDAOs.findMatchingEndsWithChars("Es");
		System.out.println(match);
		
	}

}
