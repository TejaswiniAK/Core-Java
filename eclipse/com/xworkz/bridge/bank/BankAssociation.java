package com.xworkz.bridge.bank;

public class BankAssociation {

	BankDAO dao;

	public BankAssociation(BankDAO dao) {
		super();
		this.dao = dao;
	}

	public void saveData(BankDTO bankDTO) {
		System.out.println("Invoked saveData()");
		if (bankDTO != null) {
			dao.save(bankDTO);
		} else {
			System.err.println("bankDTO is null");
		}
	}

	public void updateData(BankDTO bankDTO) {
		System.out.println("Invoked updateData() ");
		if (bankDTO != null) {
			dao.update(bankDTO);
		} else {
			System.err.println("bankDTO is null");
		}
	}

	public void deletaData(int atIndex) {
		System.out.println("Invoked deleteData()");
		dao.delete(atIndex);
	}

	public void displayAllDetails() {
		System.out.println("Invoked displayAllDetails()");
		dao.displayDetails();
	}
}
