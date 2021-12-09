package com.xworkz.heirarchy.override;

import java.util.Comparator;

public class VirusCompare implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
//		if(o1.equals(o2)){
//			System.out.println("o1 and o2 are equal");
//		}
		
		System.out.println("Ascending order");

		return o1.compareTo(o2);
	}

	
	

}
