package com.xworkz.object;

import com.xworkz.object.constants.IcecreamFlavour;
import com.xworkz.object.constants.IcecreamType;
import com.xworkz.object.methods.Icecream;

public class IcecreamStarter {

	public static void main(String[] args) {

		Icecream icecream=new Icecream("Vanilla", IcecreamFlavour.VANILLA, IcecreamType.RASPBARRY);
		
		System.out.println(icecream.toString());
		System.out.println(icecream.hashCode());
		
		Icecream icecream2=new Icecream("Chocolate", IcecreamFlavour.CHOCOLATE, IcecreamType.COOKIES);
		
		System.out.println(icecream.toString());
		System.out.println(icecream.hashCode());
		
		System.out.println(icecream.equals(icecream2));
	}

}
