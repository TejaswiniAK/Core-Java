package com.xworkz.dp;

import com.xworkz.dp.dao.BucketDAO;
import com.xworkz.dp.dto.BucketDTO;

public class BucketStarter {

	public static void main(String[] args) {

		BucketDTO bucketDTO=new BucketDTO("white", 4, 400.0f, "good", 3.5f, "asha");
		BucketDTO bucketDTO1=new BucketDTO("black", 4, 400.0f, "bad", 3.5f, "asha");
		BucketDTO bucketDTO2=new BucketDTO("red", 4, 400.0f, "nice", 3.5f, "asha");
		BucketDTO bucketDTO3=new BucketDTO("pink", 4, 400.0f, "good", 3.5f, "asha");
		BucketDTO bucketDTO4=new BucketDTO("violet", 4, 400.0f, "good", 3.5f, "asha");
		
		BucketDAO bucketDAO=new BucketDAO();
		
		bucketDAO.save(bucketDTO);
		bucketDAO.save(bucketDTO1);
		bucketDAO.save(bucketDTO2);
		bucketDAO.save(bucketDTO3);
		bucketDAO.save(bucketDTO4);
		
		bucketDAO.delete(3);
		bucketDAO.update(2, bucketDTO4);
		
		BucketDTO[] dtos=bucketDAO.getBucketDTOs();
		dtos[0]=bucketDTO;
		dtos[1]=bucketDTO1;
		dtos[2]=bucketDTO2;
		dtos[3]=bucketDTO3;
		dtos[4]=bucketDTO4;
		
		for(int i=0;i<dtos.length;i++) {
			BucketDTO ref=dtos[i];
			
			if(ref!=null) {
				System.out.println(ref.getColor());
				System.out.println(ref.getCompany());
				System.out.println(ref.getPrice());
				System.out.println(ref.getQuality());
				System.out.println(ref.getSize());
				System.out.println(ref.getWeight());
				System.out.println("------------------------------------");
			}else {
				System.err.println("array is null");
			}
		}


	}

}
