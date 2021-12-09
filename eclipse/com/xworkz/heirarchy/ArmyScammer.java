package com.xworkz.heirarchy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.heirarchy.dto.ArmyDTO;

public class ArmyScammer {

	public static void main(String[] args) {

		ArmyDTO armyDTO = new ArmyDTO("MAJ", "RANE KAUSTUBH PRAKASH KUMAR");
		ArmyDTO armyDTO2 = new ArmyDTO("SUB", "MOHD ASHRAF MIR");
		
		Set<ArmyDTO> refSet =new HashSet<ArmyDTO>();
		
		refSet.add(armyDTO2);
		refSet.add(armyDTO);
		refSet.add(armyDTO2);
		refSet.add(armyDTO);
		
		Iterator<ArmyDTO> itrSet = refSet.iterator();
		
		while(itrSet.hasNext()){
			System.out.println(itrSet.next());
		}
		
		System.out.println(refSet.size());
		
	}

}
