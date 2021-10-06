class Brand{
	String name;
	String ownerName;
	final String location="Bengaluru";//Literal and final is doesn't change value...
	int since;
	
	Brand(String name,String ownerName){
		this.name=name;
		this.ownerName=ownerName;
	}
	
	Brand(){}
}