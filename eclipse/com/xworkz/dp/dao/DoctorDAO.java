package com.xworkz.dp.dao;

import com.xworkz.dp.dto.DoctorDTO;

public class DoctorDAO {

	private DoctorDTO[] doctorDTOs=new DoctorDTO[10];
	private int count=0;
	
	public void save(DoctorDTO dto) {
		if(dto!=null && this.count<this.doctorDTOs.length && this.count>=0) {
			this.doctorDTOs[this.count++]=dto;
			System.out.println("The added names are: ".concat(dto.getHospitalName()));
		}else {
			System.err.println("Array is full or dto pointing to null");
		}
	}
	
	public void create(int index, DoctorDTO dto) {
		if(dto!=null && index<this.doctorDTOs.length && index>=0) {
			this.doctorDTOs[index]=dto;
			System.out.println("The added names are: ".concat(String.valueOf(index)).concat(" and ").concat(dto.getHospitalName()));
		}else {
			System.err.println("Array is full or dto pointing to null");
		}
	}
	
	public int indexOccupied() {
		return this.count;
	}
	
	public boolean matching(String name) {
		
		for(int i=0;i<doctorDTOs.length;i++) {
			DoctorDTO ref=doctorDTOs[i];
			
			if(ref!=null) {
				System.out.println("ref is".concat(String.valueOf(i)));
				String tempTime=ref.getHospitalName();
				System.out.println(tempTime);
				if(tempTime.equals(name)) {
					System.out.println("Time found");
					return true;
				}
			}
		}
		return false;
	}
	
}
