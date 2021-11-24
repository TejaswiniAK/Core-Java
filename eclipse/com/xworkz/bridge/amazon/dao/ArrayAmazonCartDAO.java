package com.xworkz.bridge.amazon.dao;

import com.xworkz.bridge.amazon.dto.CartDTO;

public class ArrayAmazonCartDAO implements AmazonCartDAO {

	CartDTO[] dtos = new CartDTO[10];
	int counter = 0;

	public CartDTO[] getDtos() {
		return dtos;
	}

	@Override
	public boolean save(CartDTO cartDTO) {
		System.out.println("Invoked over-ride save method");

		if (counter < dtos.length && cartDTO != null) {
			System.out.println("Checked condition...");
			this.dtos[this.counter++] = cartDTO;
			System.out.println(cartDTO.getName());
		} else {
			System.err.println("Array is full or cartDTO is null");
			return false;
		}

		return true;
	}

	@Override
	public CartDTO findByName(String name) {
		System.out.println("Invoked over-ride findByName method");

		if (name != null) {
			System.out.println("Name Checked...");

			for (int i = 0; i < dtos.length; i++) {
				CartDTO find = this.dtos[i];

				if (name != null && find != null) {
					String matchName = find.getName();

					if (name.equals(matchName)) {
						System.out.println("Name is matched... Name: ".concat(matchName));

					} else {
						System.err.println("Name not matched");
					}
				}
			}
		}
		return null;
	}

	@Override
	public void displayAllCartDetails() {

		System.out.println("Invoked over-ride displayAllCartDetails method");
		for (int i = 0; i < dtos.length; i++) {
			CartDTO ref = dtos[i];
			if (ref != null) {
				String name = dtos[i].getName();
				int quantity = dtos[i].getQuantity();
				double price = dtos[i].getPrice();
				int items = dtos[i].getItems();
				System.out.println(name);
				System.out.println(quantity);
				System.out.println(price);
				System.out.println(items);
			}
		}
	}

}
