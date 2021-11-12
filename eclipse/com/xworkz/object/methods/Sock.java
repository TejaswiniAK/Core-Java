package com.xworkz.object.methods;

import com.xworkz.object.constants.SockMaterial;
import com.xworkz.object.constants.SockSize;
import com.xworkz.object.constants.SockType;

public class Sock {

	private SockSize size;
	private float price;
	private SockMaterial material;
	private SockType type;
	
	public Sock(SockSize size, float price, SockMaterial material, SockType type) {
		super();
		this.size = size;
		this.price = price;
		this.material = material;
		this.type = type;
	}

	public SockSize getSize() {
		return size;
	}

	public float getPrice() {
		return price;
	}

	public SockMaterial getMaterial() {
		return material;
	}

	public SockType getType() {
		return type;
	}
	
	@Override
	public String toString() {
		System.out.println("Invoked toString() method from Sock");
		return "Akshiii"; //super.toString();
	}
	
	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode() method from Sock class");
		return 678;//super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equal() method from Soak class");
		if(obj==null){
			System.err.println("Object is pointing to null");
		}
			if(obj instanceof Sock){
				System.out.println("Object is Sock type");
				Sock casted=(Sock)obj;
				if(this.material.equals(casted.getMaterial()) && this.size.equals(casted.getSize())){
					System.out.println("Material : "+material+"    size : "+size+" are equal");
					return true;
				}
				else {
					System.err.println("Not equal");
				}
			}
		
		System.err.println("Object is pointing to null");
		return false;//super.equals(obj);
	}
	
}
