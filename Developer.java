class Developer{
	private String name;
	private String language;
	private double salary;
	private int projects;
	private String role;
	
	void setName(String name){
		this.name=name;
	}
	
	String getName(){
		return this.name;
	}
	
	void setLanguage(String language){
		this.language=language;
	}
	
	String getLanguage(){
		return this.language;
	}
	
	void setSalary(double salary){
		this.salary=salary;
	}
	
	double getSalary(){
		return this.salary;
	}
	
	void setProjects(int projects){
		this.projects=projects;
	}
	
	int getProjects(){
		return this.projects;
	}
	
	void setRole(String role){
		this.role=role;
	}
	
	String getRole(){
		return this.role;
	}
}