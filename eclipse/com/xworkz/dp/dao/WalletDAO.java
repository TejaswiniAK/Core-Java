package com.xworkz.dp.dao;

import com.xworkz.dp.dto.WalletDTO;

public class WalletDAO {

	WalletDTO[] dtos = new WalletDTO[10];
	int pickpocket = 0;

	public void create(WalletDTO dummi) {
		System.out.println("create method is invoked");
		if (dummi != null && this.pickpocket < dtos.length) {
			System.out.println("Created : ".concat(dummi.getCompanyName()));
			System.out.println("pickpocket ".concat(String.valueOf(this.pickpocket)));
			this.dtos[pickpocket++] = dummi;
		}else {
			System.err.println("Array is full... Wallet is pointing to null...");
		}
		System.out.println();
	}
	
	public void create(WalletDTO kempi,int solli){
		System.out.println("create overloading method is invoked");
		if(kempi!=null && solli>=0&&solli<dtos.length){
			System.out.println("Created : ".concat(kempi.getCompanyName()).concat(" at the index : ")
					.concat(String.valueOf(this.pickpocket)));
			System.out.println("pickpocket ".concat(String.valueOf(this.pickpocket)));
			this.dtos[solli]=kempi;
			pickpocket++;
		}else {
			System.err.println("Array is full kempi is pointing to null");
		}
		System.out.println();
	}
	
	public void delete(int bottel){
		System.out.println("Delete method is invoked");
		if(bottel>=0 && bottel<dtos.length){
			System.out.println("Deleted index is :".concat(String.valueOf(bottel)));
			this.dtos[bottel]=null;
		}else {
			System.err.println("bottel value is not deleted");
		}
		System.out.println();
	}
	
	public void update(WalletDTO updateName,int pg){
		System.out.println("Update method is invoked");
		if(updateName!=null && pg>=0 && pg<dtos.length){
			System.out.println("Updated name : ".concat(updateName.getCompanyName()).concat(" at the index : ").concat(String.valueOf(pg)));
			this.dtos[pg]=updateName;
		}else {
			System.err.println("Array is full updateName is pointing to null");
		}
		System.out.println();
	}
	
	public int indexOccupied(){
		return this.pickpocket;
	}
	
	public boolean matchCompany(String chair){
		for (int i = 0; i < dtos.length; i++) {
			WalletDTO yes=dtos[i];
			if(yes!=null && chair!=null){
				String matching=yes.getCompanyName();
				if(matching.equals(chair)){
					return true;
				}
			}
		}
		return false;
	}
	
	public WalletDTO[] getDtos() {
		return dtos;
	}

}
