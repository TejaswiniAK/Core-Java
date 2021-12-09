package com.xworkz.heirarchy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.heirarchy.dto.HospitalDTO;

public class HospitalScammer {

	public static void main(String[] args) {

		HospitalDTO hospitalDTO = new HospitalDTO("Central Leprosorium", "Bangalore", "Private", 20, 23350239);
		HospitalDTO hospitalDTO2 = new HospitalDTO("E.S.I Hospital", "Basavangudi", "Private", 16, 6673554);
		HospitalDTO hospitalDTO3 = new HospitalDTO("Govt. TB and CD Hospital", "Indira Nagar", "Private", 39, 25281245);
		HospitalDTO hospitalDTO4 = new HospitalDTO("Indira Gandhi Institute of Child Health Hospital",
				"Nimhans Dharmaram College", "Private", 64, 26343143);
		HospitalDTO hospitalDTO5 = new HospitalDTO("Central Leprosorium", "Bangalore", "Private", 20, 23350239);

		Set<HospitalDTO> refSet = new HashSet<HospitalDTO>();
		
		System.out.println("            SET                ");
		
		refSet.add(hospitalDTO5);
		refSet.add(hospitalDTO4);
		refSet.add(hospitalDTO3);
		refSet.add(hospitalDTO2);
		refSet.add(hospitalDTO);
		
		Iterator<HospitalDTO> itrSet = refSet.iterator();
		
		while(itrSet.hasNext()){
			HospitalDTO pointSet = itrSet.next();
			System.out.println(pointSet);
		}
		
		System.out.println();
		
		int totalSet = refSet.size();
		System.out.println("Total Set collection Size : ".concat(String.valueOf(totalSet)));
		
		System.out.println();
		
		
	}

}
