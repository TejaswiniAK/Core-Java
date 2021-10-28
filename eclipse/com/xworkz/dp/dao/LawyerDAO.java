package com.xworkz.dp.dao;

import com.xworkz.dp.dto.LawyerDTO;

public class LawyerDAO {

	private LawyerDTO[] dtos = new LawyerDTO[10];
	private int count = 0;

	public void save(LawyerDTO dto) {
		System.out.println("Invoked save method");
		if (dto != null && count < dtos.length) {

			System.out.println("count : ".concat(String.valueOf(this.count)));
			this.dtos[this.count++] = dto;

		} else {
			System.err.println("Array is full");
		}

		System.out.println();
	}

	public void save(LawyerDTO ningi, int mangi) {
		System.out.println("Invoke insert method overloading");

		if (ningi != null && mangi >= 0 && mangi < dtos.length) {
			for (int i = 0; i < dtos.length; i++) {
				this.dtos[mangi] = ningi;
				System.out.println("Saved name : ".concat(ningi.getName()).concat(" at the index : ")
						.concat(String.valueOf(mangi)));
				count++;
			}
		} else {
			System.err.println("Array is full ");
		}
		System.out.println();
	}

	public void delete(int index) {
		System.out.println("Invoked delete method");

		if (index >= 0 && index <= dtos.length) {
			this.dtos[index] = null;
			System.out.println("name deleted at the index : ".concat(String.valueOf(index)));
		} else {
			System.err.println("array is not pointing to any index");
		}
		System.out.println();
	}

	public void update(LawyerDTO bord, int atindex) {
		System.out.println("Invoked update method");

		if (bord != null && atindex >= 0 && atindex < dtos.length) {
			this.dtos[atindex] = bord;
			System.out.println(
					"Saved name : ".concat(bord.getName()).concat(" at the index : ").concat(String.valueOf(atindex)));
		} else {
			System.err.println("Array is full or index is invalid");
		}
		System.out.println();
	}

	public boolean searchByName(String searchName) {
		System.out.println("Search By Name method");
		System.out.println("------------------------");
		for (int i = 0; i < dtos.length; i++) {
			LawyerDTO hold = dtos[i];
			if (hold != null && searchName != null) {
				String lawyers = hold.getName();
				if (lawyers.equals(searchName)) {
					System.out.println("Search name found at the index : ".concat(String.valueOf(i)));
					return true;
				} else {
					System.err.println("Search name not found");
				}
			}
		}
		return false;
	}

	public boolean searchByCasesWon(int cases) {
		System.out.println("Search By CasesWon method");
		for (int i = 0; i < dtos.length; i++) {
			LawyerDTO winCase = dtos[i];
			if (winCase != null && cases != 0) {
				int lawyerExperience = winCase.getCasesWon();
				if (lawyerExperience == cases) {
					System.out.println("Search by case won is found ");
					System.out.println("Lawyer name :".concat(winCase.getName()).concat(" have cases won : ")
							.concat(String.valueOf(lawyerExperience)));
					return true;
				} else {
					System.err.println("Search name not found");
				}
			}
		}
		return false;
	}

	public LawyerDTO getLawyerWithExperience() {
		System.out.println("get Lawyer With Experience Method ");
		int max = 0;
		for (int i = 0; i < dtos.length; i++) {
			LawyerDTO maxDTO = dtos[i];
			if (maxDTO.getExperience() > max) {
				max = maxDTO.getExperience();
				System.out.println(
						"Lawyer name : ".concat(maxDTO.getName()).concat(" has maximum :").concat(String.valueOf(max)));
			}
		}
		return null;
	}
	
	public String getQualificationWithMaxExp(String name){
		System.out.println("Get Qualification With Max Experience method");
		for (int i = 0; i < dtos.length; i++) {
			LawyerDTO ref=dtos[i];
			if(ref!=null && name != null){
				String refName=ref.getName();
				String refQualification=ref.getQualification();
				if(refName.equals(name)){
					System.out.println("Lawyer Name : ".concat(refName).concat(" Qulification : ").concat(refQualification));
					System.out.println();
				}
				
			}
		}
		System.err.println("Array is pointing to null");
		System.out.println();
		return null;
	}
	
	public int getExpByName(String name){
		System.out.println("Get Expirience by Name method");
		for (int i = 0; i < dtos.length; i++) {
			LawyerDTO ref=dtos[i];
			
			if(ref!=null && name !=null){
				String have=ref.getName();
				if(have.equals(name)){
					System.out.println("Lawyer Name : ".concat(have).concat(" has expirience : ").concat(String.valueOf(ref.getExperience())));
					System.out.println();
				}
			}
		}
		return 0;
	}

	public LawyerDTO[] getDtos() {
		return dtos;
	}

}
