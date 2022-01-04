package com.xworkz.db;

import java.util.Collection;

import com.xworkz.db.dao.TrainDAO;
import com.xworkz.db.dto.TrainDTO;

public class TrainStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrainDTO dto1=new TrainDTO(1,"12345","Dharwad","Banglore",26,900.00,"A","Akola Purna Express");
		TrainDTO dto2=new TrainDTO(2,"13579","Banglore","Hyderabad",52,1700.00,"D","Shatabdhi Express");
		TrainDTO dto3=new TrainDTO(3,"02255","Amritsar","Saharsa",15,400.00,"E","Danapur Express");
		TrainDTO dto4=new TrainDTO(4,"55423","Banglore","Mysore",8,150.00,"A","Anga Express");
		TrainDTO dto5=new TrainDTO(6,"08764","New Delhi","Vishakapatnam",26,800.00,"C","Bhagalpur Express");
		TrainDTO dto6=new TrainDTO(7,"23075","Madhapur","Anand Vihar",26,200.00,"B","Baidyanath Express");
		
		TrainDAO dao=new TrainDAO();
//		dao.save(dto1);
//		dao.save(dto2);
//		dao.save(dto3);
//		dao.save(dto4);
//		dao.save(dto5);
//		dao.save(dto6);
		
//		dao.deleteByTrainNo("13209");
		
//		dao.deleteByTrainNoAndTrainId("17564", 7);
		
//		TrainDTO check=dao.getByTrainNo("07789");
//		System.out.println(check);
		
		Collection<TrainDTO> output=dao.getAll();
		System.out.println(output);
		
//		Collection<TrainDTO> res=dao.getAllByBoarding("Amritsar");
//		System.out.println(res);

	}
}
