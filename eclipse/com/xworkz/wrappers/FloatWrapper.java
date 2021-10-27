package com.xworkz.wrappers;

public class FloatWrapper {

	public static void main(String[] args) {

		float x=3.142f;
		Float obj=x;
		
		System.out.println(obj.doubleValue());
		System.out.println(obj.BYTES);
		System.out.println(obj.MIN_VALUE);
		System.out.println(obj.MIN_EXPONENT);
		System.out.println(obj.toHexString(x));
	}

}
