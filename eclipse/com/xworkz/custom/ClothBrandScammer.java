package com.xworkz.custom;

import com.xworkz.custom.dao.ClothBrandsDAO;

public class ClothBrandScammer {

	public static void main(String[] args) {

		ClothBrandsDAO brandsDAOs = new ClothBrandsDAO();

		brandsDAOs.save("LOUIS VUITTON");
		brandsDAOs.save("GUCCI");
		brandsDAOs.save("HERMES");
		brandsDAOs.save("PRADA");
		brandsDAOs.save("RALPH LAUREN");

		boolean match = brandsDAOs.findMatching("RALPH LAUREN");
		System.out.println(match);

		match = brandsDAOs.findMatchingCaseInsensitive("PraDa");
		System.out.println(match);

		match = brandsDAOs.findMatchingStartsWithChars("g");
		System.out.println(match);

		match = brandsDAOs.findMatchingEndsWithChars("a");
		System.out.println(match);

	}

}
