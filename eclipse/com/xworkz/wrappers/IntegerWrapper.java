package com.xworkz.wrappers;

public class IntegerWrapper {

	public static void main(String[] args) {
		
		int x=-104;
		Integer obj=x;
		
		short a=obj.shortValue();
		System.out.println(a);
		
		int b=obj.intValue();
		System.out.println(b);
		
		long c = obj.longValue();
		System.out.println(c);
		
		float d=obj.floatValue();
		System.out.println(d);
		
		double e=obj.doubleValue();
		System.out.println(e);
		
		String f=obj.toString();
		System.out.println(f);

	}

}
