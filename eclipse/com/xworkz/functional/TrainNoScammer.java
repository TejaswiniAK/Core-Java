package com.xworkz.functional;

import com.xworkz.functional.dao.TrainNoDAO;
import com.xworkz.functional.implemented.ElementEqual;
import com.xworkz.functional.implemented.EndsWith;
import com.xworkz.functional.implemented.EqualIgnoreCase;
import com.xworkz.functional.implemented.StartsWith;
import com.xworkz.functional.marker.Find;

public class TrainNoScammer {

	public static void main(String[] args) {

		TrainNoDAO trainNoDAO = new TrainNoDAO();
		
		Find enter = new ElementEqual();

		boolean match = trainNoDAO.find(enter, "43467");
		System.out.println(match);

		Find enter1 = new EndsWith();

		match = trainNoDAO.find(enter1, "43467");
		System.out.println(match);

		Find enter2 = new EqualIgnoreCase();

		match = trainNoDAO.find(enter2, "7");
		System.out.println(match);

		Find enter3 = new StartsWith();

		match = trainNoDAO.find(enter3, "4");
		System.out.println(match);

	


	}

}
