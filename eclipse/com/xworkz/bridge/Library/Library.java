package com.xworkz.bridge.Library;

public class Library {
	
	private LibraryRules libraryRules;
	private String name;
	
	public Library(String name) {
		System.out.println("Invoked Library no-arg constructor");
		this.name=name;
	}
	
	public void setLibraryRules(LibraryRules libraryRules) {
		this.libraryRules = libraryRules;
	}
	
	public void lendBooks(){
		System.out.println("Invoked lendBooks()");
		if(libraryRules!=null){
			System.out.println("Library is open");
			String idCard=libraryRules.identityCard();
			if(idCard !=null){
				System.out.println("Name :".concat(this.name).concat(" USN ").concat(idCard));
				
				double startTime = libraryRules.startTime();
				double returnTime = libraryRules.returnTime();
				
				if(startTime>=0 && returnTime>=0 && startTime<24 && returnTime<24){
					System.out.println("Open from ".concat(String.valueOf(startTime))
							.concat(" till ").concat(String.valueOf(returnTime)));
				}else {
					System.err.println("Library is not open");
				}
			}
			else{
				System.err.println("Dont have id card");
			}
		}
	}
	
	

}
