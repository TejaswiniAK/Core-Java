package com.xworkz.custom.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CountryDAO {
	
	private Collection<String> countries = new ArrayList<String>();

	public boolean save(String addCountry){
		return this.countries.add(addCountry);
	}
	
	public boolean findMatching(String match){
		if(match != null){
			if(this.countries.contains(match)){
				System.out.println("matched...");
				return true;
			}
		}
		return false;
	}
	
	public boolean findMatchingCaseInsensitive(String matched){
		if(matched != null){
			Iterator<String> itr = countries.iterator();
			while(itr.hasNext()){
				String moving = itr.next();
				if(moving.equalsIgnoreCase(matched)){
					System.out.println("matched with ignore case");
					return true;
				}
			}
			System.err.println("element is not there");
			
		}
		return false;
	}
	
	
	public boolean findMatchingStartsWithChars(String startsWith){
		if(startsWith != null){
			Iterator<String> itr = countries.iterator();
			while(itr.hasNext()){
				String point = itr.next();
				if(point.toUpperCase().startsWith(startsWith.toUpperCase())){
					System.out.println("matched starts with");
					return true;
				}
			}
			System.out.println("not matched starts with");
		}
		return false;
	}
	
	public boolean findMatchingEndsWithChars(String endsWith){
		if(endsWith != null){
			Iterator<String> itr = countries.iterator();
			while(itr.hasNext()){
				String point = itr.next();
				if(point.toUpperCase().endsWith(endsWith.toUpperCase())){
					return true;
				}
			}
			System.out.println("not matched starts with");
		}
		return true;
	}
	
	
}
