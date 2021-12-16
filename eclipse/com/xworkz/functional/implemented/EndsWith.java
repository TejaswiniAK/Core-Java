package com.xworkz.functional.implemented;

import com.xworkz.functional.marker.Find;

public class EndsWith implements Find{

	@Override
	public boolean expression(String arg1, String arg2) {
		System.out.println("invoked expression for endswith method");
		return arg1.endsWith(arg2);
	}

}
