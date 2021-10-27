package com.xworkz.dp;

import com.xworkz.dp.dao.WalletDAO;
import com.xworkz.dp.dto.WalletDTO;

public class WalletStarter {

	public static void main(String[] args) {
		
		//dto
		WalletDTO walletDTO=new WalletDTO("Titan", "Leather", 5, 1225.0F, 1);
		WalletDTO walletDTO2=new WalletDTO("PRT USA", "Artificial Leather", 3, 699.0F, 1);
		WalletDTO walletDTO3=new WalletDTO("Allen Solly", "Leather", 7, 599.0F, 0);
		
		//dao
		WalletDAO dao=new WalletDAO();
		
		WalletDTO[] ref=dao.getDtos();
		
		ref[0]=walletDTO;
		ref[1]=walletDTO2;
		ref[2]=walletDTO3;
		
		dao.create(walletDTO2);
		dao.create(walletDTO, 8);
		dao.delete(0);
		dao.update(walletDTO, 0);
		
		for (int i = 0; i < ref.length; i++) {
			WalletDTO array=ref[i];
			
			if(array!=null){
				System.out.println(array.getCompanyName());
				System.out.println(array.getMaterial());
				System.out.println(array.getPrice());
				System.out.println(array.getTotalCompartments());
				System.out.println(array.getCoinCompartment());
			}
			else{
				System.out.println("Array is null");
			}
			System.out.println("+++++++======++++++=======++++++");	
		}
	}

}
