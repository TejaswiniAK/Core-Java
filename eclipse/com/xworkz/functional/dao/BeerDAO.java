package com.xworkz.functional.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.functional.marker.Find;

public class BeerDAO {

	private Collection<String> beercollection = new ArrayList<String>();

	public BeerDAO() {

		beercollection.add("Beer1");
		beercollection.add("Beer2");
		beercollection.add("Beer3");
		beercollection.add("Beer4");
		beercollection.add("Beer5");
		beercollection.add("Beer6");
		beercollection.add("Beer7");
		beercollection.add("Beer8");
		beercollection.add("Beer9");
		beercollection.add("Beer10");
	}

	public boolean find(Find enter,String value){
		System.out.println("Invoked find method");
		Iterator<String> itr = beercollection.iterator();
		while(itr.hasNext()){
			String point = itr.next();
			if(enter.expression(point, value)){
				return true;
			}
		}
		return false;
	}
	
}
