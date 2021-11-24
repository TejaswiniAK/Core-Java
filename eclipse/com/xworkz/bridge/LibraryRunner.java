package com.xworkz.bridge;

import com.xworkz.bridge.Library.Library;
import com.xworkz.bridge.Library.LibraryRules;
import com.xworkz.bridge.Library.MaklaLibraryRules;

public class LibraryRunner {
	
	public static void main(String[] args) {

		LibraryRules libraryRules=new MaklaLibraryRules();
		
		Library library=new Library("Akshata");
		library.setLibraryRules(libraryRules);
		library.lendBooks();
		
		System.out.println(libraryRules.lateFees());
		System.out.println(libraryRules.registrationFees());
		
	}

}
