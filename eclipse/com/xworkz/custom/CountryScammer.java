package com.xworkz.custom;

import com.xworkz.custom.dao.CountryDAO;

public class CountryScammer {

	public static void main(String[] args) {

		CountryDAO countryDAOs = new CountryDAO();
		
		countryDAOs.save("India");
		countryDAOs.save("Indonesia");
		countryDAOs.save("Ghana");
		countryDAOs.save("France");
		countryDAOs.save("Finland");
		countryDAOs.save("Egypt");
		
		boolean match = countryDAOs.findMatching("France");
		System.out.println(match);
		
		boolean matched = countryDAOs.findMatchingCaseInsensitive("egypt");
		System.out.println(matched);
		
		boolean startMatch = countryDAOs.findMatchingStartsWithChars("f");
		System.out.println(startMatch);
		
		boolean endMatch = countryDAOs.findMatchingEndsWithChars("e");
		System.out.println(endMatch);
		
	}

}
