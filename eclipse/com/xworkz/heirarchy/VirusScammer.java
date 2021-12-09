package com.xworkz.heirarchy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.print.attribute.HashAttributeSet;

import com.xworkz.heirarchy.override.VirusCompare;
import com.xworkz.heirarchy.override.VirusListDescending;

public class VirusScammer {

	public static void main(String[] args) {

		List<String> viruses = new ArrayList<String>();

		viruses.add("Covid-19");
		viruses.add("covid-19");
		viruses.add("Omicron");
		viruses.add("Delta");
		viruses.add("Lassa");
		viruses.add("Rubella");
		viruses.add("hepatitis A");

		System.out.println("Ascending order without implementation");
		Collections.sort(viruses);
		// System.out.println(viruses);

		Iterator<String> it = viruses.iterator();
		while (it.hasNext()) {
			String point = it.next();
			System.out.println(point);
		}

		System.out.println();
		// Collections.sort(viruses);

		System.out.println("Ascending order using compare over-ridden method ");

		Comparator<String> compareAscend = new VirusCompare();

		Collections.sort(viruses, compareAscend);

		Iterator<String> it1 = viruses.iterator();

		while (it1.hasNext()) {

			String point = it1.next();
			System.out.println(point);
		}
		
		System.out.println();

		System.out.println("Descending order using compare over-ridden method ");

		Comparator<String> compareDescend = new VirusListDescending();

		Collections.sort(viruses, compareDescend);

		Iterator<String> it2 = viruses.iterator();

		while (it2.hasNext()) {

			String point = it2.next();
			System.out.println(point);
		}

//		System.out.println("-----------------------SET---------------------------");
//		
//		Set<String> disease = new HashSet<String>();
//
//		disease.add("Anthrax");
//		disease.add("Chikungunya virus disease");
//		disease.add("Dengue");
//		disease.add("Botulism");
//		disease.add("Cholera");
//		disease.add("Brucellosis");
//		disease.add("Ebola virus disease");
//		
//	
//		System.out.println("Ascending order without implementation");
//		Collections.so(disease);
//		// System.out.println(viruses);
//
//		Iterator<String> it = viruses.iterator();
//		while (it.hasNext()) {
//			String point = it.next();
//			System.out.println(point);
//		}
//
//		System.out.println();
//		// Collections.sort(viruses);
//
//		System.out.println("Ascending order using compare over-ridden method ");
//
//		Comparator<String> compareAscend = new VirusCompare();
//
//		Collections.sort(viruses, compareAscend);
//
//		Iterator<String> it1 = viruses.iterator();
//
//		while (it1.hasNext()) {
//
//			String point = it1.next();
//			System.out.println(point);
//		}
//		
//		System.out.println();
//
//		System.out.println("Descending order using compare over-ridden method ");
//
//		Comparator<String> compareDescend = new VirusListDescending();
//
//		Collections.sort(viruses, compareDescend);
//
//		Iterator<String> it2 = viruses.iterator();
//
//		while (it2.hasNext()) {
//
//			String point = it2.next();
//			System.out.println(point);
//		}
		
	}

}
