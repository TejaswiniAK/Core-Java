package com.xworkz.functional;

import com.xworkz.functional.dao.PaintDAO;
import com.xworkz.functional.implemented.ElementEqual;
import com.xworkz.functional.implemented.EndsWith;
import com.xworkz.functional.implemented.EqualIgnoreCase;
import com.xworkz.functional.implemented.StartsWith;
import com.xworkz.functional.marker.Find;

public class PaintScammer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PaintDAO paintDAO = new PaintDAO();

		Find enter = new ElementEqual();

		boolean match = paintDAO.find(enter, "Easiest Application");
		System.out.println(match);

		Find enter1 = new EndsWith();

		match = paintDAO.find(enter1, "on");
		System.out.println(match);

		Find enter2 = new EqualIgnoreCase();

		match = paintDAO.find(enter2, "easiest application");
		System.out.println(match);

		Find enter3 = new StartsWith();

		match = paintDAO.find(enter3, "e");
		System.out.println(match);

	


	}

}
