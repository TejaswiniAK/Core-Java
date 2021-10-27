package com.xworkz.starter;

public class StringaStarter {

	public static void main(String[] args) {

		String noise="Noise";
		String boat=new String("Boat");
		
		if(noise==boat){
			System.out.println("Strings are pointing to same memory");
		}
		else{
			System.out.println("Strings are pointing to different memory");
		}
	}

}
