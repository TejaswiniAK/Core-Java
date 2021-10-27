package com.xworkz.wrappers;

public class ShortWrapper {

	public static void main(String[] args) {

		short x=100;
		Short obj=x;
		
		System.out.println(obj.compareTo(x));
		System.out.println(obj.doubleValue());
		System.out.println(obj.equals(obj));
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
	}

}
