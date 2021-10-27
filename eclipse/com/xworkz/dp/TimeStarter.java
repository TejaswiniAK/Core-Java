package com.xworkz.dp;

import com.xworkz.dp.dao.TimerDAO;
import com.xworkz.dp.dto.TimerDTO;

public class TimeStarter {

	public static void main(String[] args) {

		TimerDTO timerDTO=new TimerDTO("10.00am", false, false, "titan");
		TimerDTO timerDTO1=new TimerDTO("9.00am", true, false, "sonata");
		TimerDTO timerDTO2=new TimerDTO("8.00am", false, false, "quardz");
		TimerDTO timerDTO3=new TimerDTO("7.00am", true, false, "titan");
		TimerDTO timerDTO4=new TimerDTO("6.00am", true, false, "quardz");
		
		TimerDAO timerDAO=new TimerDAO();
		
		timerDAO.save(timerDTO);
		timerDAO.save(timerDTO1);
		timerDAO.save(timerDTO2);
		timerDAO.save(timerDTO3);
		timerDAO.save(timerDTO4);
		System.out.println();
		
		timerDAO.create(3, timerDTO);
		System.out.println();
		
		int indexOccupied=timerDAO.indexOccupied();
		System.out.println("index Occupied are: ".concat(String.valueOf(indexOccupied)));
		System.out.println();
		
		boolean name=timerDAO.matching("10.00am");
		System.out.println(name);

		
	}

}
