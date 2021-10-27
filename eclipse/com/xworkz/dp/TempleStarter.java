package com.xworkz.dp;

import com.xworkz.dp.dao.TempleDAO;
import com.xworkz.dp.dto.TempleDTO;

public class TempleStarter {

	public static void main(String[] args) {

		TempleDTO templeDTO=new TempleDTO("Banashankari Temple", "Banashankari", "Banashankari", true, "9.00am");
		TempleDTO templeDTO1=new TempleDTO("Siddharooda Mata", "Old Hubli", "Siddharooda", true, "9.00am");
		TempleDTO templeDTO2=new TempleDTO("Ambhabavani Temple", "Hudako", "Ambhabavani", true, "9.00am");
		TempleDTO templeDTO3=new TempleDTO("Banashankari Temple", "BTM", "Badami", true, "9.00am");
		TempleDTO templeDTO4=new TempleDTO("Hanuman Temple", "BTM", "Hanuman", true, "9.00am");
		
		TempleDAO templeDAO=new TempleDAO();
		
		templeDAO.save(templeDTO);
		templeDAO.save(templeDTO1);
		templeDAO.save(templeDTO2);
		templeDAO.save(templeDTO3);
		templeDAO.save(templeDTO4);
		
		templeDAO.delete(3);
		templeDAO.update(2, templeDTO4);
		
		TempleDTO[] dtos=templeDAO.getTempleDTOs();
		dtos[0]=templeDTO;
		dtos[1]=templeDTO1;
		dtos[2]=templeDTO2;
		dtos[3]=templeDTO3;
		dtos[4]=templeDTO4;
		
		for(int i=0;i<dtos.length;i++) {
			TempleDTO ref=dtos[i];
			
			if(ref!=null) {
				System.out.println(ref.getLocation());
				System.out.println(ref.getMainGod());
				System.out.println(ref.getName());
				System.out.println(ref.getYestgante());
				System.out.println("-------------------------");
			}else {
				System.err.println("array is null");
			}
		}
		
		
	}

}
