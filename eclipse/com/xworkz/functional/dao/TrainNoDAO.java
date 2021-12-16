package com.xworkz.functional.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.functional.marker.Find;

public class TrainNoDAO {
	
	private Collection<String> collectionTrain = new ArrayList<String>();
	
	public TrainNoDAO() {
		collectionTrain.add("12345");
		collectionTrain.add("56759");
		collectionTrain.add("06763");
		collectionTrain.add("43467");
		collectionTrain.add("89654");
	}
	
	public boolean find(Find enter,String value){
		System.out.println("Invoked find method");
		Iterator<String> itr = collectionTrain.iterator();
		while(itr.hasNext()){
			String point = itr.next();
			if(enter.expression(point, value)){
				return true;
			}
		}
		return false;
	}
	

}
