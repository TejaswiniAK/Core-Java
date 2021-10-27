package com.xworkz.dp.dao;

import com.xworkz.dp.dto.IplDTO;

public class IplDAO {

	private IplDTO[] dtos=new IplDTO[10];
	private int count=0;
	
	public void create(IplDTO iplDTO){
		System.out.println("Create method is created");
		if(iplDTO!=null && this.count<dtos.length){
			System.out.println("Inserted : ".concat(iplDTO.getTeamName()).concat(" at the index : ").concat(String.valueOf(this.count)));
			System.out.println(this.count);
			this.dtos[this.count++]=iplDTO;
		}
		else {
			System.err.println("Array is full and IplDTO is pointing to null");
		}
		System.out.println();
	}
	
	public void create(IplDTO iplDTO,int index){
		System.out.println("Create overloading method is created ");
		if(iplDTO != null && index<dtos.length && index >=0){
			this.dtos[index]=iplDTO;
			System.out.println(this.count);
			count++;
		}
		else {
			System.err.println("Array is full iplDTO is pointing to null");
		}
		System.out.println();
	}
	
	public void delete(int juice){
		System.out.println("delete method created");
		if(juice >=0 && juice<dtos.length){
			this.dtos[juice]=null;
			System.out.println("deleted ipl team : ".concat(String.valueOf(juice)));
		}
		else {
			System.err.println("Value is not deleted ");
		}
		System.out.println();
	}
	
	public void updateTeam(IplDTO team,int kempi){
		System.out.println("Update method created");
		if(kempi >=0 && kempi <dtos.length && team !=null){
			this.dtos[kempi]=team;
			System.out.println("Updated name : ".concat(team.getTeamName()).concat(" at the the index : ").concat(String.valueOf(kempi)));
		}
		else {
			System.err.println("Array is full updated team should not be null");
		}
		System.out.println();
	}
	

	public int indexOccupied(){
		return this.count;	
	}
	
	public boolean matchOwner(String check){
		System.out.println("Match owner method ");
		for (int i = 0; i < dtos.length; i++) {
			IplDTO dto=dtos[i];
			if(dto != null && check != null){
				String team=dto.getOwner();
				if(team.equals(check))
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public IplDTO[] getDtos() {
		return dtos;
	}
	
}
