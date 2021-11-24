package com.xworkz.bridge.bird.dao;

import com.xworkz.bridge.bird.dto.BirdDTO;

public interface BirdDAO {

	void save(BirdDTO birdDTO);

	void delete(int index);

	BirdDTO findById(String name);

	void displayAllDetails();

}
