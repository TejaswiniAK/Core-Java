package com.xworkz.starter;

public class CoffeeStarter {

	public static void main(String[] args) {
		// [x][w][o][r][k][z]
		
		String institute="xworkz";
		char[] array=institute.toCharArray();
		System.out.println(array.length);
		int len=institute.length();
		System.out.println(len);
		System.out.println(array[2]);
		
		char c=institute.charAt(5);
		System.out.println(c);
		
		String partOfInstitute=institute.substring(4);
		System.out.println(partOfInstitute);
		
		partOfInstitute=partOfInstitute.replace('k', 't');
		System.out.println(partOfInstitute);
	}

}
