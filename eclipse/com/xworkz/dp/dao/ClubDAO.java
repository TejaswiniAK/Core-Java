package com.xworkz.dp.dao;

import com.xworkz.dp.dto.ClubDTO;

public class ClubDAO {

	private ClubDTO[] clubDTOs=new ClubDTO[10];
	int count=0;
	
	public void save(ClubDTO dto) {
		if (dto != null) {
			this.clubDTOs[count++] = dto;
			System.out.println(dto.getEntryPrice());
		} else {
			System.err.println("array is full or dto is null");
		}
	}
	
	public void delete(int index) {
		if (index > 0 && index <clubDTOs.length) {
			this.clubDTOs[index] = null;
			System.out.println("The deleted index is ".concat(String.valueOf(index)));
		} else {
			System.err.println("invalid index");
		}
	}
	
	public void update(int index, ClubDTO name) {
		if (index > 0 && index < clubDTOs.length && name != null) {
			this.clubDTOs[index] = name;
			System.out.println("The updated index is ".concat(String.valueOf(index)));
		} else {
			System.err.println("invalid index or index pointing to null");
		}
	}
	
	public ClubDTO[] getClubDTOs() {
		return clubDTOs;
	}
	
}
