class SocialMediaStarter{
	public static void main(String []coffee){
		
		SocialMediaApp mediaApp=new SocialMediaApp();
		mediaApp.setName("Instagram");
		System.out.println(mediaApp.name);
		
		mediaApp.setLanguage("English");
		System.out.println(mediaApp.lang);
		
		mediaApp.setSize(32);
		System.out.println(mediaApp.size);
		
		mediaApp.setPlatform("Mobile");
		System.out.println(mediaApp.platform);
		
		mediaApp.setVersion(208.0f);
		System.out.println(mediaApp.version);
		
		System.out.println(mediaApp.company);
		
		System.out.println();
		
		//String vr="000"
		//sop(vr);
		
		Company1 comp=new Company1();
		
		mediaApp.setCompany(comp);
		System.out.println(mediaApp.company);
		
		comp.setCname("Facebook");
		System.out.println(comp.name);
		
		comp.setFounder("Mark Zuckerberg");
		System.out.println(comp.founder);
		
		comp.setEst(2010);
		System.out.println(comp.est);
		
		comp.setHeadQuater("Menlo Park,CA");
		System.out.println(comp.headQuarter);
		
		comp.setRevenue(6.18f);
		System.out.println(comp.revenue);
		
		comp.setNumberOfEmployee(100);
		System.out.println(comp.noOfEmployees);
		
		comp.setNumberOfBranches(50);
		System.out.println(comp.noOfBranches);
		
		
	}
}