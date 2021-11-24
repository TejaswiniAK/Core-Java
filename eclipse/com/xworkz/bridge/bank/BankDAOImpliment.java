package com.xworkz.bridge.bank;

public class BankDAOImpliment implements BankDAO {

	private BankDTO dtos[] = new BankDTO[5];
	private int count = 0;

	@Override
	public BankDTO save(BankDTO bankDTO) {
		System.out.println("Invoked over-ride save method");
		if (bankDTO != null) {
			this.dtos[this.count++] = bankDTO;
		} else {
			System.err.println("array is full or bankDTO is null");
		}
		return null;
	}

	@Override
	public void delete(int index) {
		System.out.println("Invoked over-ride delete method");
		if (index >= 0 && index < dtos.length) {
			this.dtos[index] = null;
			System.out.println("Deleted at the index ".concat(String.valueOf(index)));
		} else {
			System.err.println("Not deleted");
		}
	}

	@Override
	public void displayDetails() {
		System.out.println("Invoked over-ride displayDetails method");
		for (int i = 0; i < dtos.length; i++) {
			BankDTO ref = dtos[i];
			if (ref != null) {
				System.out.println(ref.getId());
				System.out.println(ref.getName());
				System.out.println(ref.getIfsc());
				System.out.println(ref.getBranch());
			}
		}
	}

	public BankDTO[] getDtos() {
		return dtos;
	}

}
