package com.xworkz.bridge;

import com.xworkz.bridge.Temple.DevoteeRule;
import com.xworkz.bridge.Temple.PublicDevoteeRules;
import com.xworkz.bridge.Temple.TempleAssociation;

public class TempleRunner {

	public static void main(String[] args) {

		DevoteeRule devoteeRule=new PublicDevoteeRules();
		
		TempleAssociation association=new TempleAssociation(devoteeRule, "Iscon");
		association.allowDevotees();
		//association.displayDetails();
		
		System.out.println("-----------------------------------------------------");
		TempleAssociation association1=new TempleAssociation();
		association1.allowDevotees();
		
	}

}
