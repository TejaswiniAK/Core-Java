package com.xworkz.bridge;

import com.xworkz.bridge.amazon.AmazonBusiness;
import com.xworkz.bridge.amazon.dao.AmazonCartDAO;
import com.xworkz.bridge.amazon.dao.ArrayAmazonCartDAO;
import com.xworkz.bridge.amazon.dto.CartDTO;

public class AmazonTester {

	public static void main(String[] args) {

		AmazonCartDAO amazonCartDAO = new ArrayAmazonCartDAO();

		CartDTO cartDTO = new CartDTO("Oodie", 1, 700, 1);

		AmazonBusiness amazonBusiness = new AmazonBusiness(amazonCartDAO);

		amazonBusiness.saveCart(cartDTO);
		amazonBusiness.findCartByName(cartDTO);
		amazonBusiness.displayCart();
	}

//	public void accept(Object obj) {
//
//	}

}
