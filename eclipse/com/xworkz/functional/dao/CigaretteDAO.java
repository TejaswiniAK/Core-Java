package com.xworkz.functional.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.functional.marker.Find;

public class CigaretteDAO {
	
	private Collection<String> collectionCigarette = new ArrayList<String>();
	
	public CigaretteDAO() {
		collectionCigarette.add("Insignia");
		collectionCigarette.add("Bristol");
		collectionCigarette.add("Scissors");
		collectionCigarette.add("Players");
		collectionCigarette.add("Flake");
	}

	public boolean find(Find enter,String value){
		System.out.println("Invoked find method");
		Iterator<String> itr = collectionCigarette.iterator();
		while(itr.hasNext()){
			String point = itr.next();
			if(enter.expression(point, value)){
				return true;
			}
		}
		return false;
	}
	
}
