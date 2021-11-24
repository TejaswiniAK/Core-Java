package com.xworkz.bridge.amazon;

import com.xworkz.bridge.amazon.dao.AmazonCartDAO;
import com.xworkz.bridge.amazon.dto.CartDTO;

public class AmazonBusiness {

	// if private --- use set method
	// private AmazonCartDAO dao;
	//
	// public void setDao(AmazonCartDAO dao) {
	// this.dao = dao;
	// }

	private AmazonCartDAO dao;

	public AmazonBusiness(AmazonCartDAO out) {
		System.out.println("Invoked AmazonBusiness constuctor");
		this.dao = out;
	}

	public void saveCart(CartDTO cto) {
		System.out.println("Invoked saveCart()");
		// .save(cto);

		if (cto != null) {
			System.out.println("Invoked save()... from ArrayAmazonCartDTO");
			boolean correct = dao.save(cto);
			System.out.println(correct);

		} else {
			System.err.println("Cart has no Items");
		}
	}

	public void findCartByName(CartDTO cto) {
		System.out.println("Invoked findCartByName()");
		if (cto != null) {
			System.out.println("Invoked findByName()... from ArrayAmazonCartDTO");
			CartDTO found = dao.findByName("Oodie");
			System.out.println(found);
		} else {
			System.err.println("Cart not fount Name");
		}

	}

	public void displayCart() {
		System.out.println("Invoked displayCart()");
		dao.displayAllCartDetails();
	}

}
