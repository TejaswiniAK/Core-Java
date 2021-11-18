package com.xworkz.bridge.Temple;

public class TempleAssociation {

	private DevoteeRule devoteeRule;
	private String name;
	
	public TempleAssociation() {
		System.out.println("Invoked TempleAssociation no-arg constuctor");
	}
	
	public TempleAssociation(DevoteeRule devoteeRule, String name) {
		super();
		this.devoteeRule = devoteeRule;
		this.name = name;
	}

	public void allowDevotees(){
		System.out.println("Invoked allowDevotees method ");
		if(devoteeRule!=null){
			
			if(devoteeRule.slipperOff()){
				System.out.println("Come inside...");
				if(devoteeRule.takePhotoOff() && devoteeRule.maintanSilence()){
					System.out.println("Darshana aytu");
				}
				else{
					System.out.println("Rules follow madu");
				}
			}
			else{
				System.err.println("Slipper bittu baa");
			}
		}
		else{
			System.err.println("You are not allowd");
		}
	}
	
	public void displayDetails(){
		System.out.println(this.name);
		System.out.println(this.devoteeRule);
	}
}
