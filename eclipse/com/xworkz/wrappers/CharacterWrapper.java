package com.xworkz.wrappers;

public class CharacterWrapper {

	public static void main(String[] args) {

		char x='t';
		Character ch=x;
		
		System.out.println(ch.charValue());
		System.out.println(ch.equals(ch));
		System.out.println(ch.compareTo('d'));
		System.out.println(ch.hashCode());
		System.out.println(ch.toString());
		
	}

}
