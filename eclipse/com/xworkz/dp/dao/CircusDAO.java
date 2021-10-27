package com.xworkz.dp.dao;

import com.xworkz.dp.dto.CircusDTO;

public class CircusDAO {
	
	private CircusDTO[] dtos=new CircusDTO[10];
	private int memory=0;
	
	public void create(CircusDTO put){
		
		if(memory>=0&&memory<dtos.length&&put!=null){
			System.out.println("Circus Owner : ".concat(put.getOwner()).concat(" at the index : ").concat(String.valueOf(memory)));
			this.dtos[memory++]=put;
		}else {
			System.err.println("Array is full ");
		}
		System.out.println();
	}
	
	public void create(CircusDTO putting,int x){
		
		if(memory>=0 && memory < dtos.length&& putting!=null){
			System.out.println("Circus Owner : ".concat(putting.getOwner()).concat(" at the index : ").concat(String.valueOf(x)));
			this.dtos[x++]=putting;
			memory++;
		}else {
			System.err.println("Array is full ");
		}
		System.out.println();
	}
	
	public int indexOccupied(){
		return memory;
	}

	public boolean matchOwner(String name){
		
		for (int i = 0; i < dtos.length; i++) {
			CircusDTO dummi=dtos[i];
			if(dummi!=null && name!=null){
				String matching=dummi.getOwner();
				if(matching.equals(name)){
					return true;
				}
			}
		}
		return false;
	}
	
	public CircusDTO[] getDtos() {
		return dtos;
	}
	
	
}
