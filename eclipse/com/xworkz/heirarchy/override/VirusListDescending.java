package com.xworkz.heirarchy.override;

import java.util.Comparator;

public class VirusListDescending implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {

		System.out.println("Descending order");

		return o2.compareTo(o1);
		
	}

}
