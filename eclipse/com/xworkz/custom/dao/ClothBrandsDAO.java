package com.xworkz.custom.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ClothBrandsDAO {

	private Collection<String> brands = new ArrayList<String>();

	public boolean save(String enter) {
		return this.brands.add(enter);
	}

	public boolean findMatching(String brand) {
		if (brand != null) {
			if (this.brands.contains(brand)) {
				System.out.println("matched");
				return true;
			}
			System.err.println("Not matched...");
		}
		return false;
	}

	public boolean findMatchingCaseInsensitive(String chars) {

		if (chars != null) {
			Iterator<String> itr = brands.iterator();
			while (itr.hasNext()) {
				String point = itr.next();
				if (point.equalsIgnoreCase(chars)) {
					System.out.println("Case In-sensitive matched");
					return true;
				}
			}
			System.err.println("Case In-sensitive is not matches...");
		}
		return false;
	}

	public boolean findMatchingStartsWithChars(String chars) {

		if (chars != null) {
			Iterator<String> itr = brands.iterator();
			while (itr.hasNext()) {
				String move = itr.next();
				if (move.toLowerCase().startsWith(chars.toLowerCase())) {
					System.out.println("starts with matched");
					return true;
				}
			}
			System.err.println("starts with not matched");
		}
		return false;
	}

	public boolean findMatchingEndsWithChars(String chars) {

		if (chars != null) {
			Iterator<String> itr = brands.iterator();
			while (itr.hasNext()) {
				String move = itr.next();
				if (move.toLowerCase().endsWith(chars.toLowerCase())) {
					System.out.println("ends with matched");
					return true;
				}
			}
			System.err.println("ends with not matched");
		}
		return false;
	}

}
