package com.xworkz.object;

import com.xworkz.object.methods.Aeroplane;

public class AeroplaneStarter {

	public static void main(String[] args) {

Aeroplane aero=new Aeroplane();
		
		String aero1=aero.toString();
		System.out.println(aero1);
		int aero2=aero.hashCode();
		System.out.println(aero2);
        
		Aeroplane aero3=new Aeroplane();
		
		aero.setCompany("Emirates");
		aero3.setCompany("Emirates");
		
		aero.setGovt("central");
		aero3.setGovt("central");
		
		System.out.println(aero.equals(aero3));
	
	}

}
