package com.xworkz.bridge;

import com.xworkz.bridge.bank.BankAssociation;
import com.xworkz.bridge.bank.BankDAO;
import com.xworkz.bridge.bank.BankDAOImpliment;
import com.xworkz.bridge.bank.BankDTO;

public class BankScammer {

	public static void main(String[] args) {
		
		//dto
		
		BankDTO bankDTO=new BankDTO("123212", "SBI Bank", 1007, "KUD");
		
		BankDAO bankDAO=new BankDAOImpliment();
		
		BankAssociation association=new BankAssociation(bankDAO);
		
		association.saveData(bankDTO);
		System.out.println("-----------------------------------------");
		association.updateData(bankDTO);
		System.out.println("-----------------------------------------");
		association.deletaData(5);
		System.out.println("-----------------------------------------");
		association.displayAllDetails();
		System.out.println("-----------------------------------------");
		
		
	}
}
