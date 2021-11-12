package com.xworkz.object;

import com.xworkz.object.methods.Ipod;

public class IpodStarter {

	public static void main(String[] args) {

		// Object object=new String();

		Ipod ipod = new Ipod();
		ipod.setModelNo("abc");
		// here ipod checks override method
		System.out.println(ipod);
		// com.xworkz.object.methods.Ipod@15db9742

		System.out.println(ipod.getModelNo());

		System.out.println(ipod.toString());
		// com.xworkz.object.methods.Ipod@15db9742

		System.out.println(ipod.hashCode());
		// 366712642

		Ipod ipod2 = new Ipod();
		ipod2.setModelNo("abc");
		System.out.println(ipod2);
		// com.xworkz.object.methods.Ipod@6d06d69c

		System.out.println(ipod2.hashCode());
		// 1829164700

		// here ipod address and ipod2 address are different
		boolean e = ipod.equals(ipod2);
		System.out.println(e);
	}

}
