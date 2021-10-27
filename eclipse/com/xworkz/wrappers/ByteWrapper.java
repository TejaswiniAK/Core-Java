package com.xworkz.wrappers;

public class ByteWrapper {

	public static void main(String[] args) {

		byte x=0101;
		Byte obj=x;
		
		System.out.println(obj.compareTo(x));
		System.out.println(obj.doubleValue());
		System.out.println(obj.equals(obj));
		System.out.println(obj.hashCode());
		System.out.println(obj.longValue());
		
		
	}

}
