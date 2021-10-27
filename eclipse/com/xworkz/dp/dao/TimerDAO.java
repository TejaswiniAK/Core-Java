package com.xworkz.dp.dao;

import com.xworkz.dp.dto.TimerDTO;

public class TimerDAO {

	private TimerDTO[] timerDTOs=new TimerDTO[10];
	private int count=0;
	
	public void save(TimerDTO dto) {
		if(dto!=null && this.count<this.timerDTOs.length && this.count>=0) {
			this.timerDTOs[this.count++]=dto;
			System.out.println("The added names are: ".concat(dto.getCorrectTime()));
		}else {
			System.err.println("Array is full or dto pointing to null");
		}
	}
	
	public void create(int index, TimerDTO dto) {
		if(dto!=null && index<this.timerDTOs.length && index>=0) {
			this.timerDTOs[index]=dto;
			System.out.println("The added names are: ".concat(String.valueOf(index)).concat(" and ").concat(dto.getCorrectTime()));
		}else {
			System.err.println("Array is full or dto pointing to null");
		}
	}
	
	public int indexOccupied() {
		return this.count;
	}
	
	public boolean matching(String time) {
		
		for(int i=0;i<timerDTOs.length;i++) {
			TimerDTO ref=timerDTOs[i];
			
			if(ref!=null) {
				System.out.println("ref is".concat(String.valueOf(i)));
				String tempTime=ref.getCorrectTime();
				System.out.println(tempTime);
				if(tempTime.equals(time)) {
					System.out.println("Time found");
					return true;
				}
			}
		}
		return false;
	}
	
	
}
