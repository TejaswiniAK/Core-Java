package com.xworkz.object.methods;

import com.xworkz.object.constants.IcecreamFlavour;
import com.xworkz.object.constants.IcecreamType;

public class Icecream {

	private String name;
	private IcecreamFlavour flavour;
	private IcecreamType type;
	
	public Icecream(String name, IcecreamFlavour flavour, IcecreamType type) {
		super();
		this.name = name;
		this.flavour = flavour;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public IcecreamFlavour getFlavour() {
		return flavour;
	}

	public IcecreamType getType() {
		return type;
	}
	
	@Override
	public String toString() {
		System.out.println("Invoked toString() method from Icecream");
		return "Kempi";//super.toString();
	}
	
	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode() method from Icecream");
		return 986;//super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equal() method from Icecream");
		if(obj==null){
			System.err.println("object is pointing null");
			return false;
		}
		if(obj instanceof Icecream){
			System.out.println("Object is of Icecream type");
			Icecream casted=(Icecream)obj;
			
			if(this.flavour.equals(casted.getFlavour()) && this.name.equals(casted.getName())){
				System.out.println("Icecream Name : ".concat(name).concat(" and flavour : ")+flavour);
				System.out.println("Matched");
				return true;
			}
			else {
				System.out.println("Icecream Name : ".concat(name).concat(" and flavour : ")+flavour);
				System.err.println("Not matched");
			}
		}
		return false;//super.equals(obj);
	}
	
}
