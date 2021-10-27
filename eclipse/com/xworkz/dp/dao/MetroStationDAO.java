package com.xworkz.dp.dao;

import com.xworkz.dp.dto.MetroStationDTO;

public class MetroStationDAO {

	private MetroStationDTO[] metroStationDTO=new MetroStationDTO[10];
	int count=0;
	
	public void save(MetroStationDTO dto) {
		if (dto != null) {
			this. metroStationDTO[count++] = dto;
			System.out.println(dto.getName());
		} else {
			System.err.println("array is full or dto is null");
		}
	}
	
	public void delete(int index) {
		if (index > 0 && index <metroStationDTO.length) {
			this.metroStationDTO[index] = null;
			System.out.println("The deleted index is ".concat(String.valueOf(index)));
		} else {
			System.err.println("invalid index");
		}
	}
	
	public void update(int index, MetroStationDTO name) {
		if (index > 0 && index < metroStationDTO.length && name != null) {
			this.metroStationDTO[index] = name;
			System.out.println("The updated index is ".concat(String.valueOf(index)));
		} else {
			System.err.println("invalid index or index pointing to null");
		}
	}
	
	public MetroStationDTO[] getMetroStationDTO() {
		return metroStationDTO;
	}
	
}
