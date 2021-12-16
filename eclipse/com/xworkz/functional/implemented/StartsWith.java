package com.xworkz.functional.implemented;

import com.xworkz.functional.marker.Find;

public class StartsWith implements Find {

	@Override
	public boolean expression(String arg1, String arg2) {
		System.out.println("invoked expression for startswith");
		return arg1.startsWith(arg2);
	}

}
