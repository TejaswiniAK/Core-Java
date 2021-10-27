package com.xworkz.dp.dao;

import com.xworkz.dp.dto.DressCodeDTO;

public class DressCodeDAO {

	private DressCodeDTO[] codeDTO = new DressCodeDTO[10];
	private int count = 0;

	public void insertMaterial(DressCodeDTO materialName) {
		System.out.println("Insert method invoked");
		if (materialName != null && this.count < codeDTO.length) {
			System.out.println("Material Name : ".concat(materialName.getMaterial()).concat(" at the count/index : ")
					.concat(String.valueOf(this.count)));
			this.codeDTO[this.count++] = materialName;
			
		}
		else {
			System.err.println("either Material name should not be NUll and array is full");
		}
		System.out.println();
	}
	
	public void deleteMaterial(int index){
		System.out.println("Delete method invoked");
		if(index>=0 && index< codeDTO.length){
			this.codeDTO[index]=null;
			System.out.println("Deleted at the index : ".concat(String.valueOf(index)));
		}
		else {
			System.err.println("Value is not deleted");
		}
		System.out.println();
	}
	
	public void updateMaterial(DressCodeDTO updateMaterialName,int index){
		System.out.println("Update method invoked");
		if(index >=0 && index<this.codeDTO.length && updateMaterialName!=null){
			this.codeDTO[index]=updateMaterialName;
			System.out.println("Updated material is : ".concat(updateMaterialName.getMaterial()).concat(" at the index : ").concat(String.valueOf(index)));
		}
		else {
			System.err.println("Array is full and Update Material Name should not be null");
		}
		System.out.println();
	}
	
	/*public void display(){
		System.out.println("Display method invoked");
	
		for (int i = 0; i < codeDTO.length; i++) {

			System.out.println(codeDTO[i].getColor());
			System.out.println();
		}
	}*/
	
	public DressCodeDTO[] getCodeDTO() {
		return codeDTO;
	}
	
}
