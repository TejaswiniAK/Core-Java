package com.xworkz.heirarchy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.xworkz.heirarchy.dto.OfficeDTO;

public class OfficeScammer {

	public static void main(String[] args) {

		OfficeDTO officeDTO = new OfficeDTO("IBM", "Benglore", "MNC", 12345);

		OfficeDTO officeDTO2 = new OfficeDTO("Trinity Mobility", "Bengalore", "Product Based", 500);

		OfficeDTO officeDTO3 = new OfficeDTO("TCS", "Bengalore", "MNC", 98765);

		OfficeDTO officeDTO4 = new OfficeDTO("QuEST", "Bengalore", "Software and Digital", 4000);

		OfficeDTO officeDTO5 = new OfficeDTO("TCS", "Bengalore", "MNC", 98765);

		System.out.println("Collections using SET ");

		Set<OfficeDTO> refSet = new HashSet<OfficeDTO>();

		refSet.add(officeDTO4);
		refSet.add(officeDTO2);
		refSet.add(officeDTO5);
		refSet.add(officeDTO4);
		refSet.add(officeDTO4);
		refSet.add(officeDTO3);
		refSet.add(officeDTO);
		refSet.add(officeDTO5);

		System.out.println();

		int totalSet = refSet.size();
		System.out.println("Total size of OfficeDTO : ".concat(String.valueOf(totalSet)));

		System.out.println();

		Iterator<OfficeDTO> itrRef = refSet.iterator();

		while (itrRef.hasNext()) {
			OfficeDTO display = itrRef.next();
			System.out.println(display);
		}

		System.out.println("----------------------------------------------------------------------------");

		System.out.println("Collections using LIST");

		List<OfficeDTO> refList = new ArrayList<OfficeDTO>();

		refList.add(officeDTO5);
		refList.add(officeDTO2);
		refList.add(officeDTO3);
		refList.add(officeDTO5);
		refList.add(officeDTO);
		refList.add(officeDTO4);
		refList.add(officeDTO3);
		refList.add(officeDTO);

		System.out.println();

		int totalList = refList.size();
		System.out.println("Total size of ArrayList : ".concat(String.valueOf(totalList)));

		System.out.println();

		Iterator<OfficeDTO> itrList = refList.iterator();

		while (itrList.hasNext()) {
			OfficeDTO show = itrList.next();
			System.out.println(show);
		}

	}

}
