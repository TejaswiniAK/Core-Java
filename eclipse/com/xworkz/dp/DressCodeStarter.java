package com.xworkz.dp;

import com.xworkz.dp.dao.DressCodeDAO;
import com.xworkz.dp.dto.DressCodeDTO;

public class DressCodeStarter {

	public static void main(String[] args) {

		//dto
		DressCodeDTO dressCodeDTO= new DressCodeDTO();
		
		dressCodeDTO.setColor("White");
		dressCodeDTO.setGender('M');
		dressCodeDTO.setMaterial("Cotten");
		dressCodeDTO.setPrice(2000.0F);
		dressCodeDTO.setSize(46);
		
		DressCodeDTO dressCodeDTO1=new DressCodeDTO(40, "Polyster", "Black", 1000.0F, 'F');
		DressCodeDTO dressCodeDTO2=new DressCodeDTO(36, "Cotton", "Golden", 1500.F, 'F');
		DressCodeDTO dressCodeDTO3=new DressCodeDTO(50, "Silk", "Yellow", 5000.0F, 'F');
		
		//dao
		DressCodeDAO dressCodeDAO=new DressCodeDAO();

		DressCodeDTO[] ref=dressCodeDAO.getCodeDTO();
		
		ref[0]=dressCodeDTO1;
		ref[1]=dressCodeDTO2;
		ref[2]=dressCodeDTO3;

		dressCodeDAO.deleteMaterial(1);

		dressCodeDAO.insertMaterial(dressCodeDTO2);
		
		dressCodeDAO.updateMaterial(dressCodeDTO1, 1);
		
		/*dressCodeDAO.display();*/
		
		for (int i = 0; i < ref.length; i++) {
			DressCodeDTO array=ref[i];
			
			if(array!=null){
				System.out.println(array.getColor());
				System.out.println(array.getGender());
				System.out.println(array.getMaterial());
				System.out.println(array.getPrice());
				System.out.println(array.getSize());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
		}
		
		
		
	}

}
