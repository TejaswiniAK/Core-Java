package com.xworkz.bridge.amazon.dao;

import com.xworkz.bridge.amazon.dto.CartDTO;

public interface AmazonCartDAO {

	boolean save(CartDTO cartDTO);

	CartDTO findByName(String name);

	void displayAllCartDetails();

}
