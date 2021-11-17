package com.xworkz.bridge;

import com.xworkz.bridge.Rules.AfricaCitizen;
import com.xworkz.bridge.Rules.IndianCitizen;
import com.xworkz.bridge.Rules.MarriageRule;
import com.xworkz.bridge.Rules.TrafficRules;
import com.xworkz.bridge.Rules.VotingRule;
import com.xworkz.bridge.constants.Address;

public class RulesScanner {

	public static void main(String[] args) {
		
		VotingRule votingRule=new IndianCitizen("Varsha", Address.KARNATAKA_HUBLI);
		System.out.println(votingRule.validAge());
		System.out.println(votingRule.validId());
		System.out.println("--------------------------------------------------------------");
		
		TrafficRules trafficRules=new IndianCitizen("Akshata", Address.KARNATAKA_HUBLI);
		System.out.println(trafficRules.validLicence());
		System.out.println(trafficRules.licenseNo());
		System.out.println(trafficRules.validInsurance());
		System.out.println("--------------------------------------------------------------");
		
		MarriageRule marriageRule=new IndianCitizen("Vandana", Address.KARNATAKA_GADAG);
		System.out.println(marriageRule.validAge('F', 8));
		System.out.println("--------------------------------------------------------------");
		
		IndianCitizen indianCitizen=new IndianCitizen("Soubhagya", Address.KARNATAKA_GADAG);
		System.out.println(indianCitizen.validAge());
		System.out.println(indianCitizen.validAge());
		System.out.println(indianCitizen.validAge());
		System.out.println(indianCitizen.validInsurance());
		System.out.println(indianCitizen.validLicence());
		System.out.println(indianCitizen.validAge('M', 28));
		
		indianCitizen.displayNameAndAddressDetails();
		System.out.println("--------------------------------------------------------------");

		Object object =new IndianCitizen("Kiran", Address.KARNATAKA_GADAG);
		System.out.println(object.getClass());
		
		System.out.println("~~~~ ~~~~ ~~~~ ~~~ ~~~ ~~~ ~~~ ~~~ ~~~");
		
		VotingRule votingRule2=new AfricaCitizen();
		System.out.println(votingRule2.validAge());
		System.out.println(votingRule2.validAge());
		System.out.println("~~~~ ~~~~ ~~~~ ~~~ ~~~ ~~~ ~~~ ~~~ ~~~");
		
		TrafficRules trafficRules2=new AfricaCitizen();
		System.out.println(trafficRules2.validLicence());
		System.out.println(trafficRules2.validLicence());
		System.out.println(trafficRules2.licenseNo());
		System.out.println("~~~~ ~~~~ ~~~~ ~~~ ~~~ ~~~ ~~~ ~~~ ~~~");
		
		MarriageRule marriageRule2=new AfricaCitizen();
		System.out.println(marriageRule2.validAge('M', 25));
		System.out.println("~~~~ ~~~~ ~~~~ ~~~ ~~~ ~~~ ~~~ ~~~ ~~~");
		
		AfricaCitizen africaCitizen=new AfricaCitizen();
		africaCitizen.setName("Varsha");
		africaCitizen.setStateName("Benin");
		
		System.out.println(africaCitizen.validAge());
		System.out.println(africaCitizen.validId());
		System.out.println(africaCitizen.validLicence());
		System.out.println(africaCitizen.validInsurance());
		System.out.println(africaCitizen.licenseNo());
		System.out.println(africaCitizen.validAge('M', 30));
		africaCitizen.displayDetails();
		System.out.println("~~~~ ~~~~ ~~~~ ~~~ ~~~ ~~~ ~~~ ~~~ ~~~");
		
		Object object2=new AfricaCitizen();
		System.out.println(object2.hashCode());
		
		
	}

}
