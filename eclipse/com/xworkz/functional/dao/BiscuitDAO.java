package com.xworkz.functional.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.functional.marker.Find;

public class BiscuitDAO  {
	
	private Collection<String> collectionBiscuits = new ArrayList<String>();

	public BiscuitDAO() {
		collectionBiscuits.add("Parle G");
		collectionBiscuits.add("Nimkin");
		collectionBiscuits.add("Krackjack");
		collectionBiscuits.add("20-20 Cookies");
		//collectionBiscuits.add("Monaco-Salted Craker");
		//collectionBiscuits.add("Golden Arcs");
		//collectionBiscuits.add("Kreams");
		collectionBiscuits.add("Festo");
		collectionBiscuits.add("Oreo");
		collectionBiscuits.add("Good Day");
	}
	
	public boolean find(Find enter,String value){
		System.out.println("Invoked find method");
		Iterator<String> itr = collectionBiscuits.iterator();
		while(itr.hasNext()){
			String point = itr.next();
			if(enter.expression(point, value)){
				return true;
			}
		}
		return false;
	}
	
	
	
}
