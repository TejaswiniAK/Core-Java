class ForestStarter{
	public static void main(String a[]){
		
		Forest f=new Forest("Bhanneru Gatta","Bhanneru Gatta",true);
		System.out.println(f.Fname);
		System.out.println(f.location);
		System.out.println(f.reserved);
		System.out.println(f.state1);
		
		System.out.println();
		
		f.state1=new State("bb");
		State s1=f.state1;
		System.out.println(f.state1);
		System.out.println();
		System.out.println(s1.Sname);
		System.out.println(s1.noOfDistricts);
		System.out.println(s1.cmName);
		System.out.println(s1.capital);
		
		
		s1.capital=new CapitalCity("BLR","IT");
		CapitalCity c1=s1.capital;
		System.out.println(s1.capital);
		System.out.println();
		System.out.println(c1.Cname);
		System.out.println(c1.population);
		System.out.println(c1.famousFor);
		
		
	
		
	}
}