package com.xworkz.custom;

import com.xworkz.custom.dao.PincodeDAO;

public class PincodeScammer {

	public static void main(String[] args) {
		
		PincodeDAO pincodeDAOs = new PincodeDAO();
		
		pincodeDAOs.save(580007);
		pincodeDAOs.save(580029);
		pincodeDAOs.save(580218);
		pincodeDAOs.save(580009);
		pincodeDAOs.save(580602);
		
		boolean match = pincodeDAOs.findMatching(580009);
		System.out.println(match);
		
		boolean match1 = pincodeDAOs.findMatchingStartsWithChars(5);
		System.out.println(match1);
		
		match1 = pincodeDAOs.findMatchingEndsWithChars(4);
		System.out.println(match1);
		
	}
}
