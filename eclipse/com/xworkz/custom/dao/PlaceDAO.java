package com.xworkz.custom.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class PlaceDAO {

	private Collection<String> places = new ArrayList<String>();

	// save
	public boolean save(String name) {
		// System.out.println("Invoked save method");
		return this.places.add(name);
	}

	// findMatching using only contains
	public boolean findMatching(String match) {
		if (match != null) {
			if (places.contains(match)) {
				System.out.println("place matched");
				return true;
			}
			System.err.println("place not matched");
		}
		return false;
	}

	// findMatchingCaseInsensitive
	public boolean findMatchingCaseInsensitive(String chars) {
		if (chars != null) {
			Iterator<String> itr = places.iterator();
			while (itr.hasNext()) {
				String move = itr.next();
				if(move.equalsIgnoreCase(chars)){
					System.out.println("matched with ignoring case sensitive");
					return true;
				}
			}
			System.err.println("element is not with any place");
		}
		return false;
	}

	// findMatchingStartsWithChars
	public boolean findMatchingStartsWithChars(String chars) {
		if(chars != null){
			Iterator<String> itr = places.iterator();
			while(itr.hasNext()){
				String move = itr.next();
				if(move.toUpperCase().startsWith(chars.toUpperCase())){
					System.out.println("starts with matched");
					return true;
				}	
			}
			System.err.println("starts with not match");
		}
		return false;
	}

	// findMatchingEndsWithChars
	public boolean findMatchingEndsWithChars(String chars) {
		if(chars != null){
			Iterator<String> itr = places.iterator();
			while(itr.hasNext()){
				String move = itr.next();
				if(move.toUpperCase().endsWith(chars.toUpperCase())){
					System.out.println("ends with matched");
					return true;
				}
			}
			System.err.println("endes with is not matched");
		}
		return false;
	}
	
	// @Override
	// public boolean equals(Object obj) {
	// System.out.println("over-ride equals method ");
	// if(obj != null)
	// return false;
	// }

	// findMatching using Iterator
	// public boolean findMatching(String place){
	// System.out.println("Invoked findMatching method");
	// if(place != null){
	// Iterator<String> itr = places.iterator();
	// while(itr.hasNext()){
	// String next = itr.next();
	// System.out.println(next.contains(place));
	// return true;
	// }
	// }
	// return false;
	// }

}
