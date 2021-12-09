package com.xworkz.heirarchy.dto;

public class ArmyDTO {

	private String rank,name;

	public ArmyDTO(String rank, String name) {
		super();
		this.rank = rank;
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ArmyDTO [rank=" + rank + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode()");
		return 3554;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals method");
		if(obj != null){
			if(obj instanceof ArmyDTO){
				ArmyDTO casted = (ArmyDTO)obj;
				if(this.name.equals(casted.name) && this.rank.equals(casted.rank)){
					return true;
				}
			}
		}
		return false;
	}
	
}
