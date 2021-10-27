package com.xworkz.dp;

import com.xworkz.dp.dao.MetroStationDAO;
import com.xworkz.dp.dto.MetroStationDTO;

public class MetroStationStarter {

	public static void main(String[] args) {

		MetroStationDTO metroStationDTO=new MetroStationDTO("Rajaji nagar Metro station", "rajaji nagar", false, "10.00am", "11.00pm");
		MetroStationDTO metroStationDTO1=new MetroStationDTO("BTM Metro station", "rajaji nagar", false, "10.00am", "11.00pm");
		MetroStationDTO metroStationDTO2=new MetroStationDTO("Jay nagar Metro station", "rajaji nagar", false, "10.00am", "11.00pm");
		MetroStationDTO metroStationDTO3=new MetroStationDTO("jp nagar Metro station", "rajaji nagar", false, "10.00am", "11.00pm");
		MetroStationDTO metroStationDTO4=new MetroStationDTO("Banashanakri Metro station", "rajaji nagar", false, "10.00am", "11.00pm");

		MetroStationDAO metroStationDAO=new MetroStationDAO();
		
		metroStationDAO.save(metroStationDTO);
		metroStationDAO.save(metroStationDTO1);
		metroStationDAO.save(metroStationDTO2);
		metroStationDAO.save(metroStationDTO3);
		metroStationDAO.save(metroStationDTO4);
		
		metroStationDAO.delete(3);
		metroStationDAO.update(2, metroStationDTO4);
		
		MetroStationDTO[] dtos=metroStationDAO.getMetroStationDTO();
		dtos[0]=metroStationDTO;
		dtos[1]=metroStationDTO1;
		dtos[2]=metroStationDTO2;
		dtos[3]=metroStationDTO3;
		dtos[4]=metroStationDTO4;
		
		for(int i=0;i<dtos.length;i++) {
			MetroStationDTO ref=dtos[i];
			
			if(ref!=null) {
				System.out.println(ref.getCloseTime());
				System.out.println(ref.getName());
				System.out.println(ref.getOpenTime());
				System.out.println(ref.getRoute());
				System.out.println("------------------------------------");
			}else {
				System.err.println("array is null");
			}
		}

		
		
	}

}
