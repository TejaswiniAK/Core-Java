package com.xworkz.functional.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.functional.marker.Find;

public class PaintDAO {
	
	private Collection<String> collectionPaint = new ArrayList<String>();
	
	public PaintDAO() {
		collectionPaint.add("Best Coverage");
		collectionPaint.add("Most Durable");
		collectionPaint.add("Easiest Application");
		collectionPaint.add("Best Zero-VOC Paint");
		collectionPaint.add("Fastest Dry Time");
	}
	
	public boolean find(Find enter,String value){
		System.out.println("Invoked find method");
		Iterator<String> itr = collectionPaint.iterator();
		while(itr.hasNext()){
			String point = itr.next();
			if(enter.expression(point, value)){
				return true;
			}
		}
		return false;
	}

}
