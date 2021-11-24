package com.xworkz.bridge.bird;

import com.xworkz.bridge.bird.dao.BirdDAO;
import com.xworkz.bridge.bird.dto.BirdDTO;

public class BirdAssociation {
	
	BirdDAO dao;
	
	public BirdAssociation(BirdDAO birdDAO) {
		System.out.println("Invoked BirdAssociation const");
		this.dao=birdDAO;
	}
	
	public void saveData(BirdDTO birdDTO){
		System.out.println("Invoked saveData()");
		if(birdDTO!=null){
			dao.save(birdDTO);
		}else {
			System.err.println("birdDTO is null");
		}
	}

	public void deleteData(int num){
		System.out.println("Invoked deleteData()");
		if(num!=0){
			dao.delete(num);
		}else{
			System.err.println("Not deleted");
		}
	}
	
	public void displayAllData(){
		System.out.println("Invoked displayAllData()");
		dao.displayAllDetails();
	}
}
