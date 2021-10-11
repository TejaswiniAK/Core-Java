class Contractor{
	private String name;
	private String type;
	private boolean equipments;
	private boolean skills;
	private double salary;
	
	void setName(String name){
		this.name=name;
	}
	
	String getName(){
		return this.name;
	}
	
	void setType(String type){
		this.type=type;
	}
	
	String getType(){
		return this.type;
	}
	
	void setEquipments(boolean equipments){
		this.equipments=equipments;
	}
	
	boolean getEquipments(){
		return this.equipments;
	}
	
	void setSkills(boolean skills){
		this.skills=skills;
	}
	
	boolean getSkills(){
		return this.skills;
	}
	
	void setSalary(double salary){
		this.salary=salary;
	}
	
	double getSalary(){
		return this.salary;
	}
}