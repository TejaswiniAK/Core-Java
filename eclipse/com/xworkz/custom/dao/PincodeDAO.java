package com.xworkz.custom.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PincodeDAO {

	private Collection<Integer> pincodes = new ArrayList<Integer>();
	
	public boolean save(int enter){
		return this.pincodes.add(enter);
	}
	
	public boolean findMatching(int find){
		if(find != 0){
			Iterator<Integer> itr = pincodes.iterator();
			while(itr.hasNext()){
				int pointing = itr.next();
				if(pointing == find){
					System.out.println("matched...");
					return true;
				}
			}
			System.err.println("not match");
		}
		return false;
	}
	
	public boolean findMatchingStartsWithChars(int starsWith){
		String convert = Integer.toString(starsWith);
		if(starsWith != 0){
			Iterator<Integer> itr = pincodes.iterator();
			while(itr.hasNext()){
				int pointing = itr.next();
				String s = Integer.toString(pointing);
				//if(s.toUpperCase().startsWith(convert.toUpperCase())){    --OR--
				if(s.startsWith(convert)){
					System.out.println("Starts with matched");
					return true;
				}
			}
			System.err.println("Starts with not matched...");
		}
		
		return false;
		
	}
	
	public boolean findMatchingEndsWithChars(int endsWith){
		String convert = Integer.toString(endsWith);
		if(endsWith != 0){
			Iterator<Integer> itr = pincodes.iterator();
			while(itr.hasNext()){
				int pointing = itr.next();
				String str = Integer.toString(pointing);
				
				if(str.endsWith(convert)){
					System.out.println("ends with matched");
					return true;
				}
			}
			System.err.println("ends with not matched");
		}
		return false;
	}
	
	
}
