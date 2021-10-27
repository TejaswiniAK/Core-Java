package com.xworkz.dp.dao;

import com.xworkz.dp.dto.BucketDTO;

public class BucketDAO {

	private BucketDTO[] bucketDTOs = new BucketDTO[10];
	int count = 0;

	public void save(BucketDTO dto) {
		if (dto != null) {
			this.bucketDTOs[count++] = dto;
			System.out.println(dto.getCompany());
		} else {
			System.err.println("array is full or dto is null");
		}
	}

	public void delete(int index) {
		if (index > 0 && index < bucketDTOs.length) {
			this.bucketDTOs[index] = null;
			System.out.println("The deleted index is ".concat(String.valueOf(index)));
		} else {
			System.err.println("invalid index");
		}
	}

	public void update(int index, BucketDTO name) {
		if (index > 0 && index < bucketDTOs.length && name != null) {
			this.bucketDTOs[index] = name;
			System.out.println("The updated index is ".concat(String.valueOf(index)));
		} else {
			System.err.println("invalid index or index pointing to null");
		}
	}
	
	public BucketDTO[] getBucketDTOs() {
		return bucketDTOs;
	}

	
}
