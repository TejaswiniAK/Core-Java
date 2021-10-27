package com.xworkz.starter;

public class StringStarter {

	public static void main(String[] args) {
		String name="Hi... ";
		
		int len=name.length();
		System.out.println("Length of the name is "+len);
		
		boolean is=name.isEmpty();
		System.out.println("The name String is empty "+is);
		
		String s=name.trim();
		System.out.println("___"+s+"___");
		
		int index=name.codePointAt(5);
		System.out.println(index);
		
		int count=name.codePointCount(0, 6);
		System.out.println(count);
		
		boolean endswith=name.endsWith("-");
		System.out.println(endswith);
		
		String address="Shivagiri Dharwad";
		System.out.println(address.substring(5,9));
		
		System.out.println(address.replace(' ','-'));
		
		System.out.println(address.matches(name));
		
		System.out.println(address.contains(" "));
	}

}
