package com.xworkz.bridge.bank;

public interface BankDAO {

	BankDTO save(BankDTO bankDTO);

	void delete(int index);

	void displayDetails();
	
	default void update(BankDTO bankDTO){
		System.out.println("Invoked update method from BankDAO");
		System.out.println("Incomplete....  :(  ");
	}

}
