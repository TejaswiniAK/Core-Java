package com.xworkz.wrappers;

public class BooleanWrapper {

	public static void main(String[] args) {

		boolean x=true;
		Boolean obj=x;
		
		System.out.println(obj.booleanValue());
		System.out.println(obj.compareTo(false));
		System.out.println(obj.equals(obj));
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		
	}

}
