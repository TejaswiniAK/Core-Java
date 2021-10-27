package com.xworkz.dp.dao;

import com.xworkz.dp.dto.CameraDTO;

public class CameraDAO {

	CameraDTO[] cameraDTOs = new CameraDTO[10];
	int count = 0;

	public void save(CameraDTO dto) {
		if (dto != null) {
			this.cameraDTOs[count++] = dto;
			System.out.println(dto.getCompany());
		} else {
			System.err.println("array is full or dto is null");
		}
	}

	public void delete(int index) {
		if (index > 0 && index < cameraDTOs.length) {
			this.cameraDTOs[index] = null;
			System.out.println("The deleted index is ".concat(String.valueOf(index)));
		} else {
			System.err.println("invalid index");
		}
	}

	public void update(int index, CameraDTO name) {
		if (index > 0 && index < cameraDTOs.length && name != null) {
			this.cameraDTOs[index] = name;
			System.out.println("The updated index is ".concat(String.valueOf(index)));
		} else {
			System.err.println("invalid index or index pointing to null");
		}
	}
	
	public CameraDTO[] getCameraDTOs() {
		return cameraDTOs;
	}
	
}
