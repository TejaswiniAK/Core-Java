class DeveloperStarter{
	public static void main(String args[]){
		Developer developer=new Developer();
		developer.setName("Tejaswini");
		String name=developer.getName();
		System.out.println(name);
		developer.setLanguage("Java Program");
		String language=developer.getLanguage();
		System.out.println(language);
		developer.setSalary(30000.56d);
		double salary=developer.getSalary();
		System.out.println(salary);
		developer.setProjects(4);
		int projects=developer.getProjects();
		System.out.println(projects);
		developer.setRole("Team Leader");
		String role=developer.getRole();
		System.out.println(role);
	}
}