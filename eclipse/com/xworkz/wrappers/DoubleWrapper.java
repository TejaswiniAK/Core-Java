package com.xworkz.wrappers;

public class DoubleWrapper {

	public static void main(String[] args) {

		double y=123456789;
		Double obj=y;
		
		System.out.println(obj.doubleValue());
		System.out.println(obj.floatValue());
		System.out.println(obj.getClass());
		System.out.println(obj.BYTES);
		System.out.println(obj.SIZE);
	}

}
