package com.xworkz.functional.implemented;

import com.xworkz.functional.marker.Find;

public class ElementSearch implements Find{

	@Override
	public boolean expression(String arg1, String arg2) {
		System.out.println("Invoked expression by contains method");
		return arg1.contains(arg2);
	}

}
