package com.xworkz.dp;

import com.xworkz.dp.dao.MilkCanDAO;
import com.xworkz.dp.dto.MilkCan;

public class MilkCanStarter {

	public static void main(String[] args) {

		MilkCan milkCan=new MilkCan(3, "round", "good", "red", 300.0f);
		MilkCan milkCan0=new MilkCan(2, "round", "bad", "white", 300.0f);
		MilkCan milkCan1=new MilkCan(1, "round", "good", "pink", 300.0f);
		MilkCan milkCan2=new MilkCan(2, "round", "good", "white", 300.0f);
		MilkCan milkCan3=new MilkCan(3, "round", "bad", "black", 300.0f);
		
		MilkCanDAO milkCanDAO=new MilkCanDAO();
		
		milkCanDAO.save(milkCan);
		milkCanDAO.save(milkCan0);
		milkCanDAO.save(milkCan1);
		milkCanDAO.save(milkCan2);
		milkCanDAO.save(milkCan3);
		
		System.out.println();
		
		milkCanDAO.create(6, new MilkCan(4, "square", "bad", "green", 300.0f));
		
		System.out.println();
		
		int indexOccupied=milkCanDAO.indexOccupied();
		System.out.println("Index occupied are ".concat(String.valueOf(indexOccupied)));
		
		System.out.println();
		
		boolean name=milkCanDAO.matching("black");
		System.out.println(name);

		
	}

}
