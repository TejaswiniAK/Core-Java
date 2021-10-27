package com.xworkz.dp.dao;

import com.xworkz.dp.dto.TempleDTO;

public class TempleDAO {
	
	private TempleDTO[] templeDTOs=new TempleDTO[10];
	int count=0;
	
	public void save(TempleDTO dto) {
		if(dto!=null) {
		this.templeDTOs[count++]=dto;
		System.out.println(dto.getName());
		}else {
			System.err.println("array is full or dto is null");
		}
	}
	
	public void delete(int index) {
		if(index>0 && index<templeDTOs.length) {
		this.templeDTOs[index]=null;
		System.out.println("The deleted index is ".concat(String.valueOf(index)));
		}else {
			System.err.println("invalid index");
		}
	}	
	
	public void update(int index, TempleDTO name) {
		if(index>0 && index<templeDTOs.length && name!=null) {
		this.templeDTOs[index]=name;
		System.out.println("The updated index is ".concat(String.valueOf(index)));
		}else {
			System.err.println("invalid index or index pointing to null");
		}
	}
	
	public TempleDTO[] getTempleDTOs() {
		return templeDTOs;
	}

}
