package com.xworkz.dp.dao;

import com.xworkz.dp.dto.WebSeriesDTO;

public class WebSeriesDAO {

	private WebSeriesDTO[] dtos = new WebSeriesDTO[10];
	private int count = 0;

	public void save(WebSeriesDTO seriesName) {
		System.out.println("Save method invoked");
		if (this.count < dtos.length && seriesName != null) {
			this.dtos[this.count++] = seriesName;
			System.out.println("Svaed Name : ".concat(seriesName.getName()));
		} else {
			System.err.println("value is not added to save method");
		}
		System.out.println();
	}

	public void delete(int index) {
		System.out.println("Delete Method invoked");
		if (index >= 0 && index < this.dtos.length) {
			this.dtos[index] = null;
			System.out.println("Deleted : ".concat(String.valueOf(index)));
		} else {
			System.err.println("value is not deleted ");
		}
		System.out.println();
	}
	
	public void update(WebSeriesDTO updateName,int index){
		System.out.println("Update method invoked");
		if(index >= 0 && index < this.dtos.length && updateName != null){
			this.dtos[index]=updateName;
			System.out.println("Name : ".concat(updateName.getName()).concat(" at index : ").concat(String.valueOf(index)));
		}
		else {
			System.err.println("either Array is full or update name should not be null ");
		}
		System.out.println();
	}
	
	/*public void display(){
		for (int i = 0; i < dtos.length; i++) {
			System.out.println(dtos[i]);
		}
	}*/
	
	public WebSeriesDTO[] getDtos(){
		return dtos;
	}

}
