package com.xworkz.dp;

import com.xworkz.dp.dao.CameraDAO;
import com.xworkz.dp.dto.CameraDTO;

public class CameraStarter {

	public static void main(String[] args) {

		CameraDTO cameraDTO=new CameraDTO("Nikon", null, 3.5f, 35000, 50000, 5.5f);
		CameraDTO cameraDTO1=new CameraDTO("Panasonic", null, 3.5f, 35000, 50000, 5.5f);
		CameraDTO cameraDTO2=new CameraDTO("Kodak", null, 3.5f, 35000, 50000, 5.5f);
		CameraDTO cameraDTO3=new CameraDTO("Pentax", null, 3.5f, 35000, 50000, 5.5f);
		CameraDTO cameraDTO4=new CameraDTO("GoPro", null, 3.5f, 35000, 50000, 5.5f);

		CameraDAO cameraDAO=new CameraDAO();
		
		cameraDAO.save(cameraDTO);
		cameraDAO.save(cameraDTO1);
		cameraDAO.save(cameraDTO2);
		cameraDAO.save(cameraDTO3);
		cameraDAO.save(cameraDTO4);
		
		cameraDAO.delete(3);
		cameraDAO.update(2, cameraDTO4);
		
		CameraDTO[] dtos=cameraDAO.getCameraDTOs();
		dtos[0]=cameraDTO;
		dtos[1]=cameraDTO1;
		dtos[2]=cameraDTO2;
		dtos[3]=cameraDTO3;
		dtos[4]=cameraDTO4;
		
		for(int i=0;i<dtos.length;i++) {
			CameraDTO ref=dtos[i];
			
			if(ref!=null) {
				System.out.println(ref.getBatteryCapacity());
				System.out.println(ref.getCompany());
				System.out.println(ref.getCost());
				System.out.println(ref.getPixel());
				System.out.println(ref.getType());
				System.out.println(ref.getWeight());
				System.out.println("--------------");
			}else {
				System.err.println("array is full");
			}
		
	}

		
	}

}
