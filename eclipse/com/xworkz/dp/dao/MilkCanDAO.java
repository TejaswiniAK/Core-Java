package com.xworkz.dp.dao;

import com.xworkz.dp.dto.MilkCan;

public class MilkCanDAO {

	private MilkCan[] milkCans=new MilkCan[10];
	private int count=0;
	
	public void save(MilkCan dto) {
		if(dto!=null && this.count<this.milkCans.length && this.count>=0) {
			this.milkCans[this.count++]=dto;
			System.out.println("The added name is:".concat(dto.getColor()));
		}else {
			System.err.println("Array is full and dto is null");
		}
		
	}
	
	public void create(int index, MilkCan dto) {
		if(dto!=null && index<this.milkCans.length && index>=0) {
			this.milkCans[index]=dto;
			System.out.println("The added index and name are ".concat(String.valueOf(index)).concat(" and ").concat(dto.getColor()));
			this.count++;
		}else {
			System.err.println("index is invalid or pointing to null");
		}
	}
	
	public int indexOccupied() {
		return this.count;
	}
	
	public boolean matching(String color) {
		for(int i=0;i<milkCans.length;i++) {
			MilkCan ref=milkCans[i];
			
			if(ref!=null) {
				System.out.println("ref is".concat(String.valueOf(i)));
				String tempColor=ref.getColor();
				System.out.println(tempColor);
				if(tempColor.equals(color)) {
					System.out.println("Color found");
					return true;
				}
			}
		}
		
		return false;
		
	}
	
}
